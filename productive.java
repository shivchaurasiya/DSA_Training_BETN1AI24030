import java.util.Scanner;

public class productive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();

            if (p >= 10 && p % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}