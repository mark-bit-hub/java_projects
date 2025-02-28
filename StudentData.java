import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentData {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>(); // Store student data

        System.out.print("Enter the number of students: ");
        int numStudents = getValidInt(s1); // Get number of students with validation

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter data for student " + (i + 1) + ":");
            String name = getValidString(s1, "Enter name: ");
            String regNo = getValidString(s1, "Enter registration number: ");
            String course = getValidString(s1, "Enter course: ");
            String gender = getValidString(s1, "Enter gender: ");

            Student student = new Student(name, regNo, course, gender);
            students.add(student);
        }

        // Display the collected data
        System.out.println("\nStudent Data:");
        for (Student student : students) {
            System.out.println(student); // Assuming Student class has a toString() method
        }

        s1.close();
    }

    // Input validation methods
    public static int getValidInt(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }
    }

    public static String getValidString(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (!input.isEmpty()) { // Basic check for non-empty input
                return input;
            } else {
                System.out.println("Input cannot be empty.");
            }
        }
    }
}
// Student class
class Student {
    String name;
    String regNo;
    String course;
    String gender;

    public Student(String name, String regNo, String course, String gender) {
        this.name = name;
        this.regNo = regNo;
        this.course = course;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", RegNo: " + regNo + ", Course: " + course + ", Gender: " + gender;
    }
}