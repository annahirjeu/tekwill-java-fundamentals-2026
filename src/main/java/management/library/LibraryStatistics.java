package management.library;//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

/**
 *
 * @author aminoiu
 * @since 5/6/2026
 */
public final class LibraryStatistics {
    public static int totalBorrowedItems = 0;

    public static void bookBorrowed() {
        totalBorrowedItems++;
    }
    public static void displayTotalBorrowedItems() {
        System.out.println("Total borrowed items: " + totalBorrowedItems);
    }
}