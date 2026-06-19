//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author aminoiu
 * @since 6/16/2026
 */
public class OrderManagement {
    public static void main(String[] args) {
        List<Product> order = new ArrayList<>(List.of(
                new Product("laptop", 0.0),
                new Product("phone", 100.00),
                new Product("tablet", 50.00),
                new Product("monitor", 150.00),
                new Product("apple phone", 1000.00)
        ));

        double orderPrice = order.stream()
                .mapToDouble(product -> product.getPrice())
                .sum();

        double price = 0.0;
        for (Product product : order) {
            price += product.getPrice();
        }
        System.out.println("Total order price: $" + orderPrice);

        Optional<Product> maxProduct = order.stream()
                .max((p1, p2) -> {
                    return Double.compare(p1.getPrice(), p2.getPrice());
                });

        Optional<Product> minProduct = order.stream()
                .min((p1, p2) -> {
                    return Double.compare(p1.getPrice(), p2.getPrice());
                });

        maxProduct.ifPresent(product -> System.out.println("Max product: " + product.getName() + " - $" + product.getPrice()));
        if (minProduct.isPresent()) {
            Product minFoundProduct = minProduct.get();
            System.out.println("Min product: " + minFoundProduct.getName() + " - $" + minFoundProduct.getPrice());
        }

        boolean anyProductWithHigherPrice = order.stream()
                .anyMatch(product -> product.getPrice() > 1000.00);
        System.out.println("Any product with higher price: " + anyProductWithHigherPrice);
        boolean anyProductWithHigherPrice2 = false;
        for (Product product : order) {
            if (product.getPrice() > 1000.00) {
                anyProductWithHigherPrice2 = true;
                break;
            }
        }

        boolean allProductsValid = order.stream()
                .allMatch(product -> product.getPrice() > 0.0);

        System.out.println("All products valid: " + allProductsValid);
        boolean allProductsValid2 = true;
        for (Product product : order) {
            if (product.getPrice() <= 0.0) {
                allProductsValid2 = false;
                break;
            }
        }

        order.stream()
                .limit(3)
                .forEach(product -> System.out.println(product.toString()));

        order.stream()
                .skip(2)
                .limit(2)
                .forEach(product -> System.out.println(product.toString()));
    }
}