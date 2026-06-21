import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Keyboard", "Electronics"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "Mouse", "Electronics"),
                new Product(104, "Speaker", "Electronics")
        };

        Product linearResult = SearchAlgorithms.linearSearch(products, "Mouse");

        if (linearResult != null) {
            System.out.println("Product found using Linear Search: " +
                    linearResult.productName);
        }

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        Product binaryResult = SearchAlgorithms.binarySearch(products, "Mouse");

        if (binaryResult != null) {
            System.out.println("Product found using Binary Search: " +
                    binaryResult.productName);
        }
    }
}
