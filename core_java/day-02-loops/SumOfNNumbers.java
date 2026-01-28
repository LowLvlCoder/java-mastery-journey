import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.print("Enter a value:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of " + n + ": " + sum);

        sc.close();
    }
}
