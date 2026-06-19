//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author aminoiu
 * @since 6/15/2026
 */
public class ProductManager {

//    static List<String> products = new ArrayList<>();

    static List<String> products = List.of("laptop", "phone", "apple phone", "tablet", "monitor", "phone");


    public static void main(String[] args) {
        System.out.println("1. Show all products: ");
        products.forEach(product -> System.out.println(product));

        products.stream()
                .forEach(product -> System.out.println(product));

        System.out.println("\n2. Show all products that contain 'phone': ");
        products.stream()
                .filter(product -> product.contains("phone"))
                .forEach(product -> System.out.println(product));

        System.out.println("\n3. Show all products and convert them to uppercase: ");
        products.stream()
                .map(product -> product.toUpperCase())
                .forEach(product -> System.out.println(product));

        List<String> upperCaseProducts = products.stream()
                .map(product -> product.toUpperCase())
                .toList();

        System.out.println("\n4. Sort product names in alphabetic order");
        products.stream()
                .sorted()
                .forEach(product -> System.out.println(product));

        System.out.println("\n5. Sort product names by name lenght");
        products.stream()
                .sorted((p1, p2) -> {
                    if (p1.length() > p2.length()) return 1;
                    else if (p1.length() < p2.length()) return -1;
                    else return 0;
                })
                .forEach(product -> System.out.println(product));
/*

        products.stream()
                .sorted((p1, p2) -> {
                    return Integer.compare(p1.length(), Integer.valueOf(p2.length()));
                })
                .forEach(product -> System.out.println(product));
*/

        System.out.println("\n6. Show all products without duplicates");
        products.stream()
                .distinct()
                .forEach(product -> System.out.println(product));

        products.stream()
                .collect(Collectors.toSet());
        Set<String> distingProducts = new HashSet<>(products);


    }

/*    void processFIle() throws RuntimeException {
        FileInputStream fileInputStream = new FileInputStream("textfile.txt");
    }*/
}