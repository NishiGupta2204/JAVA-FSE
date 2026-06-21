public class Main {

    public static void main(String[] args) {

        TaskManagementSystem system = new TaskManagementSystem();

        system.addTask(101, "Complete Assignment", "Pending");
        system.addTask(102, "Prepare Presentation", "In Progress");
        system.addTask(103, "Submit Report", "Completed");

        System.out.println("Task List:");
        system.displayTasks();

        System.out.println("\nSearching Task with ID 102:");
        system.searchTask(102);

        System.out.println("\nDeleting Task with ID 101:");
        system.deleteTask(101);

        System.out.println("\nUpdated Task List:");
        system.displayTasks();
    }
}