public class SearchAlgorithms {

    // Linear Search
    public static Product linearSearch(Product[] products, String target) {

        for (Product product : products) {

            if (product.productName.equalsIgnoreCase(target)) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String target) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int comparison = products[mid].productName.compareToIgnoreCase(target);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}
