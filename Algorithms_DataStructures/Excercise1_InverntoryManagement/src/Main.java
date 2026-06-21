public class Main {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product(101, "Laptop", 15, 65000));
        manager.addProduct(new Product(102, "Mouse", 50, 500));
        manager.addProduct(new Product(103, "Keyboard", 30, 1200));

        System.out.println("Inventory Details");
        System.out.println();

        manager.displayProducts();

        manager.updateProduct(102, 60, 550);

        manager.deleteProduct(103);

        System.out.println("\nUpdated Inventory");
        System.out.println();

        manager.displayProducts();
    }
}
