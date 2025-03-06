import java.util.Scanner;

public class RentCar {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter your age: ");
        while (!s1.hasNextInt()) {
            System.out.println("Invalid age input. Please enter a positive number.");
            s1.nextLine(); // Clear invalid input
        }
        int age = s1.nextInt();
        s1.nextLine(); // Consume newline

        System.out.print("Do you have a DL ('true' or 'false'): ");
        while (!s1.hasNextBoolean()) {
            System.out.println("Invalid input. Please enter 'true' or 'false'.");
            s1.nextLine(); // Clear invalid input
        }
        boolean hasLicense = s1.nextBoolean();
        s1.nextLine(); // Consume newline

        String canRent = checkIfEligible(age, hasLicense);
        System.out.println(canRent);

        s1.close();
    }

    public static String checkIfEligible(int age, boolean hasLicense) {
        return (age >= 21 && hasLicense) ? "Eligible to rent a car" : "Not eligible to rent a car";
    }
}
