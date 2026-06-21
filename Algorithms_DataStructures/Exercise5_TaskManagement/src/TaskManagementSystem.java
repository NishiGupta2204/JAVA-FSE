public class TaskManagementSystem {

    Task head;

    public void addTask(int taskId, String taskName, String status) {

        Task newTask = new Task(taskId, taskName, status);

        if (head == null) {
            head = newTask;
        } else {
            newTask.next = head;
            head = newTask;
        }
    }

    public void searchTask(int taskId) {

        Task current = head;

        while (current != null) {

            if (current.taskId == taskId) {
                System.out.println("Task Found:");
                System.out.println(current);
                return;
            }

            current = current.next;
        }

        System.out.println("Task not found.");
    }

    public void displayTasks() {

        Task current = head;

        while (current != null) {

            System.out.println(current);
            current = current.next;
        }
    }

    public void deleteTask(int taskId) {

        Task current = head;
        Task previous = null;

        while (current != null && current.taskId != taskId) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task not found.");
            return;
        }

        if (previous == null) {
            head = head.next;
        } else {
            previous.next = current.next;
        }

        System.out.println("Task deleted successfully.");
    }
}
