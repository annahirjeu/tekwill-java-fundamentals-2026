package management;//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

import management.library.LibraryStatistics;
import management.library.books.Book;
import management.library.books.EBook;

import java.util.Scanner;

/**
 *
 * @author aminoiu
 * @since 5/6/2026
 */
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book listOfBooks[] = new Book[0];
        EBook listOfEBooks[] = new EBook[0];
        do {
            int option;
            displayMenu();

            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1 -> addBooks(sc, listOfBooks, listOfEBooks);
                case 2 -> displayBook(sc, listOfBooks, listOfEBooks);
                case 3 -> borrowAnyBook(sc, listOfBooks, listOfEBooks);
                case 4 -> LibraryStatistics.displayTotalBorrowedItems();
                case 5 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid option, choose again:");
            }
            if (option == 5) {
                sc.close();
                break;
            }
        } while (true);
    }

    private static void displayMenu() {
        System.out.println("1. Add books");
        System.out.println("2. Display info about a book");
        System.out.println("3. Borrow a book");
        System.out.println("4. Display total borrowed items");
        System.out.println("5. Exit");
    }

    private static void borrowAnyBook(Scanner sc, Book[] listOfBooks, EBook[] listOfEBooks) {
        System.out.println("Borrow a book");
        System.out.println("Enter the book title:");
        String title = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < listOfBooks.length; i++) {
            if (listOfBooks[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println(listOfBooks[i].toString());
                listOfBooks[i].borrowItem();
                found = true;
                break;
            }
        }
        if (!found) {
            for (EBook eBook : listOfEBooks) {
                if (eBook.getTitle().equalsIgnoreCase(title)) {
                    System.out.println(eBook.toString());
                    eBook.borrowItem();
                    found = true;
                    break;
                }
            }
        }
        if (!found) System.out.println("Book not found to be borrowed!");
    }

    private static void displayBook(Scanner sc, Book[] listOfBooks, EBook[] listOfEBooks) {
        System.out.println("Display info about a book");
        System.out.println("Enter the book title:");
        String title = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < listOfBooks.length; i++) {
            if (listOfBooks[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println(listOfBooks[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            for (EBook eBook : listOfEBooks) {
                if (eBook.getTitle().equalsIgnoreCase(title)) {
                    System.out.println(eBook.toString());
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Book not found!");
        }
    }

    private static EBook[] getEBooks(Scanner sc) {
        EBook[] listOfEBooks;
        System.out.println("How many books you add?");
        int nrOfBooks = Integer.parseInt(sc.nextLine());
        listOfEBooks = new EBook[nrOfBooks];
        for (int i = 0; i < nrOfBooks; i++) {
            System.out.println("Enter title:");
            String title = sc.nextLine();
            System.out.println("Enter author:");
            String author = sc.nextLine();
            System.out.println("Enter year:");
            int year = Integer.parseInt(sc.nextLine());
            System.out.println("Enter file size:");
            double fileSize = Double.parseDouble(sc.nextLine());
            EBook eBook = new EBook(title, author, year, fileSize);
            listOfEBooks[i] = eBook;
        }
        return listOfEBooks;
    }

    private static Book[] getBooks(Scanner sc) {
        Book[] listOfBooks;
        System.out.println("How many books you add?");
        int nrOfBooks = Integer.parseInt(sc.nextLine());
        listOfBooks = new Book[nrOfBooks];
        for (int i = 0; i < nrOfBooks; i++) {
            System.out.println("Enter title:");
            String title = sc.nextLine();
            System.out.println("Enter author:");
            String author = sc.nextLine();
            System.out.println("Enter year:");
            int year = Integer.parseInt(sc.nextLine());
            System.out.println("Enter number of pages:");
            int pages = Integer.parseInt(sc.nextLine());
            Book book = new Book(title, author, year, pages);
            listOfBooks[i] = book;
        }
        return listOfBooks;
    }

    private static void addBooks(Scanner sc, Book[] listOfBooks, EBook[] listOfEBooks) {
        System.out.println("Add books");
        System.out.println("1. Add physical books");
        System.out.println("2. Add eBooks");
        int bookType = Integer.parseInt(sc.nextLine());
        if (bookType == 1) {
            listOfBooks = getBooks(sc);
        } else if (bookType == 2) {
            listOfEBooks = getEBooks(sc);
        } else {
            System.out.println("Invalid book type, returning to main menu.");
        }
    }
}