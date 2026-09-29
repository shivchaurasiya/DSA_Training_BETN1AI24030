import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int primeCount = 0;
        int compositeCount = 0;

        while (n > 0) {
            int digit = n % 10;

            int count = 0;

            for (int i = 1; i <= digit; i++) {
                if (digit % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                primeCount++;
            } else if (count > 2) {
                compositeCount++;
            }

            n = n / 10;
        }

        System.out.println("Prime numbers = " + primeCount);
        System.out.println("Composite numbers = " + compositeCount);
    }
}