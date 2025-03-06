public class CorrectDivisorCounter {

    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            int count = 0;
            System.out.print("Number: " + num + ", Divisors: ");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                    count++;
                }
            }
            System.out.println(", Count: " + count);
            if (count % 2 != 0) {
                System.out.println("BULB " + num + " ON");
            }
        }
    }
}
