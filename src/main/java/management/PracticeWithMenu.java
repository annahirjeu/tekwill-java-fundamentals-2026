package management;

import java.util.Scanner;

/**
 *
 * @author aminoiu
 * @since 4/10/2026
 */
public class PracticeWithMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Object scanner= new Scanner(System.in);

        int option;
        double totalPrice = 0;
        String productName = "";
        int quantity = 0;
        do {
            System.out.println("\n=== Mini Shop Online ===");
            System.out.println("1. Add product in cart");
            System.out.println("2. View total order price");
            System.out.println("3. Finish order");
            System.out.println("4. Exit");

            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 -> {
                    System.out.println("\nAdd product in cart");
                    System.out.println("Choose product:");
                    System.out.println("1. Laptop - 20000 MDL");
                    System.out.println("2. Phone - 10000 MDL");
                    System.out.println("3. Headphones - 1500 MDL");
                    System.out.println("4. Keyboard - 800 MDL");

                    int productOption = Integer.parseInt(sc.nextLine());
                    double price = 0;

                    switch (productOption) {
                        case 1 -> {
                            productName = "Laptop";
                            price = 20000;
                        }
                        case 2 -> {
                            productName = "Phone";
                            price = 10000;
                        }
                        case 3 -> {
                            productName = "Headphones";
                            price = 1500;
                        }
                        case 4 -> {
                            productName = "Keyboard";
                            price = 800;
                        }
                        default -> {
                            System.out.println("Invalid product option, returning to main menu.");
                        }
                    }
                    if (price > 0) {

                        do {
                            System.out.println("Enter quantity:");
                            quantity = Integer.parseInt(sc.nextLine());
                            if (quantity <= 0) System.out.println("Invalid quantity, returning to main menu.");
                        }
                        while (quantity <= 0);

                        for (int i = 1; i <= quantity; i++) {
                            totalPrice += price;
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Current total price: " + totalPrice + " MDL");
                }
                case 3 -> {
                    double discount = 0;

                    if (totalPrice >= 20000) {
                        discount = totalPrice * 0.10;
                    } else if (totalPrice >= 10000) {
                        discount = totalPrice * 0.05;
                    }

                    double finalPrice = totalPrice - discount;
                    String discountMessage = discount > 0 ? "Discount applied - " + discount + " MDL" : "No discount!";

                    System.out.println("\n=== Order Summary ===");
                    System.out.println("Product name: " + productName);
                    System.out.println("Quantity: " + quantity);

                    System.out.println("Total: " + finalPrice + " MDL");
                    System.out.println(discountMessage);
                    System.out.println("Thank you for shopping with us!");

                    totalPrice = 0;
                    productName = "";
                    quantity = 0;
                }
                case 4 -> {
                    System.out.println("Goodbye!");
                }
                default -> {
                    System.out.println("Invalid option, choose again:");
                }
            }

        } while (option != 4);
        sc.close();
    }
}