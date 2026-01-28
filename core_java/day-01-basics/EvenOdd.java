import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integers:");
        int num1 = sc.nextInt();

        String result = num1 % 2 == 0 ? "even" : "odd";

        System.out.println(num1 + " is " + result);

        sc.close();
    }
}
