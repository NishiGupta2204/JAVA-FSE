public class EmployeeManagementSystem {

    Employee[] employees;
    int size;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee employee) {

        if (size < employees.length) {
            employees[size] = employee;
            size++;
        }
    }

    public Employee searchEmployee(int employeeId) {

        for (int i = 0; i < size; i++) {

            if (employees[i].employeeId == employeeId) {
                return employees[i];
            }
        }

        return null;
    }

    public void displayEmployees() {

        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int employeeId) {

        for (int i = 0; i < size; i++) {

            if (employees[i].employeeId == employeeId) {

                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                size--;
                System.out.println("Employee deleted successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }
}
