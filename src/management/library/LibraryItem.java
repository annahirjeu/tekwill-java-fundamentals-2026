package management.library;//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

/**
 *
 * @author aminoiu
 * @since 5/6/2026
 */
public abstract class LibraryItem {
    private String title;
    private String author;
    private int year;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public abstract void borrowItem();

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ")";
    }
}