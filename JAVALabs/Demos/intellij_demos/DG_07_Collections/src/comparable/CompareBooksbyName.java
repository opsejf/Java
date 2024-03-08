package comparable;

import java.util.Comparator;

public class CompareBooksbyName implements Comparator<Book> {

    // Demo 7.19 - The Comparator Interface - by Name

    @Override
    public int compare(Book arg0, Book arg1) {

        return (arg0.getTitle().compareTo(arg1.getTitle()));
    }
}
