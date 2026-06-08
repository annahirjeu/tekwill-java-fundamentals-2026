//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package shopping.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aminoiu
 * @since 6/5/2026
 */
public class ShoppingListManager {
    static Scanner scanner = new Scanner(System.in);
    static List<String> shoppingList = new ArrayList<>();

    public static void main(String[] args) {

        do {
            System.out.println("Shopping List: ");
            System.out.println("====================");
            System.out.println("1. Add Product");
            System.out.println("2. Show the list");
            System.out.println("3. Show first and last product");
            System.out.println("4. Add product on a specific position");
            System.out.println("5. Replace product");
            System.out.println("6. Remove first element of X");
            System.out.println("7. Verify if contains product X");
            System.out.println("8. Show number of products");
            System.out.println("9. Clear the list");
            System.out.println("10. Exit");
            System.out.println("====================");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 10) break;
            switch (choice) {
                case 1 -> addProduct();
                case 2 -> showList();
                case 3 -> showFirstAndLastProdcut();
                case 4 -> addProductAtPosition();
                case 5 -> replaceProduct();
                case 6 -> removeFirstElement();
                case 7 -> verifyIfProductExists();
                case 8 -> getNumberOfProducts();
                case 9 -> clearList();
//                case 10 -> System.exit(0);
            }


        } while (true);


    }

    private static void clearList() {
        shoppingList.clear();
        System.out.println("List cleared");
    }

    private static void getNumberOfProducts() {
        System.out.println("Number of products: " + shoppingList.size());
    }

    private static void verifyIfProductExists() {
        System.out.println("Enter product name to verify: ");
        String productName = scanner.nextLine();
/*        if(shoppingList.contains(productName)){
            System.out.println("The product exists in the list");
        } else {
            System.out.println("The product does not exist in the list");
        }*/

        for (String product : shoppingList) {
            String productLowerCase = product.toLowerCase();
            String productNameLowerCase = productName.toLowerCase();
            if (productLowerCase.equals(productNameLowerCase)) {
                System.out.println("The product exists in the list");
                return;
            }
        }
    }

    private static void removeFirstElement() {
        System.out.println("Enter product name to remove: ");
        String productName = scanner.nextLine();
        for (int i = 0; i < shoppingList.size(); i++) {
            if (shoppingList.get(i).equalsIgnoreCase(productName)) {
                shoppingList.remove(i);
                break;
            }
        }

    }

    private static void replaceProduct() {
        System.out.println("Enter product name to replace: ");
        String productName = scanner.nextLine();
        System.out.println("Enter new product name: ");
        String newProductName = scanner.nextLine();

        for (int i = 0; i < shoppingList.size(); i++) {
            if (shoppingList.get(i).equalsIgnoreCase(productName)) {
                shoppingList.set(i, newProductName);
                break;
            }
        }

    }

    private static void addProductAtPosition() {
        System.out.println("Enter position");
        int position = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product name: ");
        String productName = scanner.nextLine();
        shoppingList.add(position, productName);
    }

    private static void showFirstAndLastProdcut() {
        System.out.println("First product: " + shoppingList.get(0));//shoppingList.getFirst()
        System.out.println("Last product: " + shoppingList.get(shoppingList.size() - 1));//shoppingList.getLast()
        System.out.println("====================");
    }

    private static void showList() {
/*        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }*/

        for (String product : shoppingList) {
            System.out.println(product);
        }

/*        Iterator<String> iterator = shoppingList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        shoppingList.forEach((String p)-> System.out.println(p));*/

    }

    private static void addProduct() {
        System.out.println("Enter product name: ");
        String productName = scanner.nextLine();
        shoppingList.add(productName);
    }
}