
import java.util.*;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        HashMap<Integer, Employee> employeeMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- Employee Management System Menu-----\n");
            System.out.println("1. Add Employee");
            System.out.println("2. Retrieve Employee by ID");
            System.out.println("3. List All Employees");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    Employee newEmployee = new Employee(id, name);
                    employeeList.add(newEmployee);
                    employeeMap.put(id, newEmployee);
                    System.out.println("Employee added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Employee ID to retrieve: ");
                    int retrieveId = sc.nextInt();
                    Employee retrievedEmployee = employeeMap.get(retrieveId);

                    if (retrievedEmployee != null) {
                        System.out.println("Employee ID: " + retrievedEmployee.getId());
                        System.out.println("Employee Name: " + retrievedEmployee.getName());
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 3:
                    System.out.println("List of All Employees:");
                    for (Employee employee : employeeList) {
                        System.out.println("Employee ID: " + employee.getId());
                        System.out.println("Employee Name: " + employee.getName());
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exiting the system");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("!!! Invalid choice try again !!!\n");
                    break;
            }
        }
    }
}

