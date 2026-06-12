//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package inventory.system;

import com.sun.jdi.IntegerValue;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author aminoiu
 * @since 6/10/2026
 */
public class ProductInventorySystem {
    static Scanner scanner = new Scanner(System.in);
    static HashMap<String, Integer> productStock = new HashMap<>();

    public static void main(String[] args) {
        do {
            System.out.println("Product Inventory System");
            System.out.println("1. Add Product");
            System.out.println("2. Return product stock qty");
            System.out.println("3. Update product stock qty");
            System.out.println("4. Remove product");
            System.out.println("5. Verify if product exists");
            System.out.println("6. Show all products");
            System.out.println("7. Exit");

            int option = Integer.parseInt(scanner.nextLine());
            if (option == 7) break;
            switch (option) {
                case 1 -> addProductAndStock();
                case 2 -> showProductStock();
                case 3 -> updateProductQty();
                case 4 -> removeProduct();
                case 5 -> verifyIfProductExists();
                case 6 -> showAllProducts();
            }
        } while (true);
    }

    private static void showAllProducts() {
        for (Map.Entry<String, Integer> entry : productStock.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void verifyIfProductExists() {
        System.out.println("Enter product name to verify: ");
        String productName = scanner.nextLine();
        for (String key : productStock.keySet()) {
            if (key.equalsIgnoreCase(productName)) {
                System.out.println("The product exists in the list");
                return;
            }
        }
//        productStock.containsKey(productName);
    }

    private static void removeProduct() {
        System.out.println("Enter product name: ");
        String productName = scanner.nextLine();
//        productStock.remove(productName);
        String keyToDelete = null;
        for (String key : productStock.keySet()) {
            if (key.equalsIgnoreCase(productName)) {
                keyToDelete = key;
            }
        }
        productStock.remove(keyToDelete);

    }

    private static void updateProductQty() {
        System.out.println("Enter product name");
        String productName = scanner.nextLine();
        System.out.println("Enter new product stock qty");
        int newStockQty = Integer.parseInt(scanner.nextLine());
        for (String key : productStock.keySet()) {
            if (key.equalsIgnoreCase(productName)) {
                productName = key; //productStock.remove(key)
            }
        }
        productStock.put(productName, newStockQty);
    }

    private static void showProductStock() {
        System.out.println("Enter product name: ");
        String productName = scanner.nextLine();
//        int stockQty = productStock.get(productName);
        int stockQty = 0;
        for (String key : productStock.keySet()) {
            if (key.equalsIgnoreCase(productName)) {
                stockQty = productStock.get(key);
            }
        }

/*        for(Map.Entry<String, Integer> entry : productStock.entrySet()){
            if(entry.getKey().equalsIgnoreCase(productName)){
                stockQty = entry.getValue();
            }
        }*/
        System.out.println("Stock qty for product [" + productName + "] is: " + stockQty);
    }

    private static void addProductAndStock() {
        System.out.println("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.println("Enter product stock qty: ");
        int stockQty = Integer.parseInt(scanner.nextLine());
        productStock.put(productName, stockQty);
    }
}