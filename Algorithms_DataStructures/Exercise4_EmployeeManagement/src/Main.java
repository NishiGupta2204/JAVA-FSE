public class Main {

    public static void main(String[] args) {

        EmployeeManagementSystem system = new EmployeeManagementSystem(10);

        system.addEmployee(new Employee(101, "Nishi", "Developer", 50000));
        system.addEmployee(new Employee(102, "Riya", "Tester", 45000));
        system.addEmployee(new Employee(103, "Aman", "Manager", 70000));

        System.out.println("Employee Records:");

        system.displayEmployees();

        System.out.println("\nSearching Employee with ID 102:");

        Employee employee = system.searchEmployee(102);

        if (employee != null) {
            System.out.println(employee);
        }

        system.deleteEmployee(103);

        System.out.println("\nUpdated Employee Records:");

        system.displayEmployees();
    }
}
