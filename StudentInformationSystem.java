import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int studentId;
    private String course;

    public Student(String name, int studentId, String course) {
        this.name = name;
        this.studentId = studentId;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }
    public String getName(){
        return name;
    }

    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Course: " + course;
    }
}

public class StudentInformationSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- Student Information System Menu ----- \n");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice - ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter student course: ");
                    String course = scanner.nextLine();

                    Student newStudent = new Student(name, studentId, course);
                    students.add(newStudent);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students in the system.");
                    } else {
                        System.out.println("List of students:");
                        for (Student student : students) {
                            System.out.println(student.toString());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter student ID to search: ");
                    //int searchId = scanner.nextInt();
                    String nm =scanner.nextLine();
                    boolean found = false;
                    for (Student student : students) {
                        if (student.getName().equalsIgnoreCase(nm)) {
                            System.out.println("Student found:\n" + student.toString());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter student ID to remove: ");
                    int removeId = scanner.nextInt();
                    boolean removed = false;
                    for (Student student : students) {
                        if (student.getStudentId() == removeId) {
                            students.remove(student);
                            System.out.println("Student removed successfully.");
                            removed = true;
                            break;
                        }
                    }
                    if (removed == false) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        
        }
    }
}

