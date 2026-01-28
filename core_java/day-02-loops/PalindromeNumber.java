import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int reverseNumber = 0;

        while (n != 0) {
            int digit = n % 10;
            reverseNumber = ((reverseNumber * 10) + digit);
            n /= 10;
        }

        if (temp == reverseNumber) {
            System.out.println(temp + " is a palindrome.");
        } else {
            System.out.println(temp + " is not a palindrome.");
        }

        sc.close();
    }
}
