public class Main {

    public static void main(String[] args) {

        Order[] orders = {
                new Order(101, "Nishi", 2500),
                new Order(102, "Riya", 1800),
                new Order(103, "Aman", 5000),
                new Order(104, "Priya", 3200)
        };

        System.out.println("Orders before sorting:");

        for (Order order : orders) {
            System.out.println(order);
        }

        BubbleSort.bubbleSort(orders);

        System.out.println("\nOrders after Bubble Sort:");

        for (Order order : orders) {
            System.out.println(order);
        }

        QuickSort.quickSort(orders, 0, orders.length - 1);

        System.out.println("\nOrders after Quick Sort:");

        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
