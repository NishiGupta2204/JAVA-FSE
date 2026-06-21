import java.util.HashMap;

public class InventoryManager {

    HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(int productId, int quantity, double price) {

        if (inventory.containsKey(productId)) {

            Product product = inventory.get(productId);

            product.setQuantity(quantity);
            product.setPrice(price);

            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int productId) {

        if (inventory.containsKey(productId)) {

            inventory.remove(productId);

            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayProducts() {

        for (Product product : inventory.values()) {

            System.out.println(product);
            System.out.println();
        }
    }
}
