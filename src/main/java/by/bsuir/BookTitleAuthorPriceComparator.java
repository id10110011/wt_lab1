package by.bsuir;

import java.util.Comparator;

public class BookTitleAuthorPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int result = o1.getTitle().compareTo(o2.getTitle());
        result = result == 0 ? o1.getAuthor().compareTo(o2.getAuthor()) : result;
        return result == 0 ? o1.getPrice() - o2.getPrice() : result;
    }
}
