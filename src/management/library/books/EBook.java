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
public class EBook extends LibraryItem {
    private double fileSize;

    public EBook(String title, String author, int year, double fileSize) {
        super(title, author, year);
        this.fileSize = fileSize;
    }

    @Override
    public void borrowItem() {
        System.out.println("You have borrowed an eBook: " + this.toString() + " with file size of " + fileSize + " MB.");
        LibraryStatistics.bookBorrowed();
    }
}