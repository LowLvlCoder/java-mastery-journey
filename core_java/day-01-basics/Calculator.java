import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first operand:");
        int a = sc.nextInt();
        System.out.print("Enter the second operand:");
        int b = sc.nextInt();
        System.out.print("Enter operator(+,-,*,/,%):");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Result: " + (a + b));
        } else if (op == '-') {
            System.out.println("Result: " + (a - b));
        } else if (op == '*') {
            System.out.println("Result: " + (a * b));
        } else if (op == '/') {
            System.out.println("Result: " + (a / b));
        } else if (op == '%') {
            System.out.println("Result: " + (a % b));
        } else {
            System.out.println("Enter a valid operand.");
        }

        sc.close();
    }
}
