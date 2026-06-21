public class MVCDemo {

    public static void main(String[] args) {

        Employee employee = new Employee(
                101,
                "Nishi Gupta",
                "Software Development"
        );

        EmployeeView view = new EmployeeView();

        EmployeeController controller =
                new EmployeeController(employee, view);

        controller.updateView();

        System.out.println("\nUpdating employee details...\n");

        controller.setEmployeeName("Nishi G.");

        controller.updateView();
    }
}
