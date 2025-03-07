import java.util.Random;

public class NumberComparison {

    public static void main(String[] args) {
        Random random = new Random();
        int target = 67; // The target value to exceed

        while (true) {
            int num1 = random.nextInt(100) + 1;
            int num2 = random.nextInt(100) + 1;
            int num3 = random.nextInt(100) + 1;
            int maxNumber = findMax(num1, num2, num3);

            if (maxNumber > target) {
                System.out.println("Max Number: " + maxNumber + " (Exceeds " + target + ")");
                break; // Exit the loop when the condition is met
            } else {
                System.out.println("Max Number: " + maxNumber + " (Below " + target + ")");
            }
        }
    }

    public static int findMax(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3)); // Use Math.max for cleaner logic
    }
}
