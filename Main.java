import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student by ID");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter id: ");
                    int id = sc.nextInt();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter department: ");
                    String dept = sc.nextLine();

                    service.addStudent(new Student(name, id, age, dept));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter student ID to search: ");
                    int sid = sc.nextInt();

                    Student s = service.searchStudent(sid);
                    if (s != null) {
                        System.out.println("Student Found");
                        System.out.println("Name: " + s.getName());
                        System.out.println("Age: " + s.getAge());
                        System.out.println("Dept: " + s.getDept());
                    } else {
                        System.out.println("Student not found");
                    }
                    break;

                case 3:
                    System.out.println("\nAll Students:");
                    service.displayStudents();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

