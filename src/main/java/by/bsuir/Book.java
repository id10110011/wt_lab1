package by.bsuir;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private int price;
    private String isbn;

    private static int edition;

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public Book() {}

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = title + author + price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        Book book = (Book) obj;
        return  (this.title.equals(book.title))
                && (this.author.equals(book.author))
                && (this.price == book.price);
    }

    @Override
    public int hashCode() {
        int hash = 11;
        hash = 31 * hash + (this.title != null ? this.title.hashCode() : 0);
        hash = 31 * hash + (this.author != null ? this.author.hashCode() : 0);
        hash = 31 * hash + this.price;
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName()).append("[Название: ")
                .append(this.title).append("; Автор: ").append(this.author)
                .append("; Цена: ").append(this.price).append("]");
        return stringBuilder.toString();
    }

    @Override
    public Book clone() {
        Book book = new Book();
        book.title = this.title;
        book.author = this.author;
        book.price = this.price;
        return book;
    }

    @Override
    public int compareTo(Book book) {
        return this.isbn.compareTo(book.isbn);
    }
}
