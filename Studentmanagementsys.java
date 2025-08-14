import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    double grade;

    Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return id + " - " + name + " - " + grade;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Grade: ");
                    double grade = sc.nextDouble();
                    students.add(new Student(id, name, grade));
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.println("\nList of Students:");
                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;
                case 3:
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = sc.nextInt();
                    students.removeIf(s -> s.id == removeId);
                    System.out.println("Student removed successfully!");
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
