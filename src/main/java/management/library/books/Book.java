package management.library.books;//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

import management.library.LibraryItem;
import management.library.LibraryStatistics;

/**
 *
 * @author aminoiu
 * @since 5/6/2026
 */
public class Book extends LibraryItem {
    private int pages;

    public Book(String title, String author, int year, int pages) {
        super(title, author, year);
        this.pages = pages;
    }


    @Override
    public void borrowItem() {
        System.out.println("You have borrowed a physical book: " + this.toString() + " with " + pages + " pages.");
        LibraryStatistics.bookBorrowed();
    }


}