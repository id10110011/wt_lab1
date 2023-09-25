package by.bsuir;

import java.util.Comparator;

public class BookAuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int result = o1.getAuthor().compareTo(o2.getAuthor());
        return result == 0 ? o1.getTitle().compareTo(o2.getTitle()) : result;
    }
}
