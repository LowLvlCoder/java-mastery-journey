import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int noOfDigits = 0;
        int temp = n;
        while (n != 0) {
            n /= 10;
            noOfDigits++;
        }

        System.out.println("Number of Digits in " + temp + ": " + noOfDigits);

        sc.close();
    }
}