import java.util.Scanner;

public class Factorial {
    public static int factorial(int num) {
        int fact = 1;
        if (num == 0 && num == 1) {
            return 1;
        } else {
            for (int i = num; i > 1; i--) {
                fact *= i;
            }
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        int result = factorial(num);

        System.out.println("Factorial of " + num + " = " + result);

        sc.close();
    }
}
