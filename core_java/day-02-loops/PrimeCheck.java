import java.util.Scanner;

public class PrimeCheck {

    public static boolean checkPrime(double num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        double num = sc.nextDouble();

        if (num == 1) {
            System.out.println(num + " is not a prime");
        } else if (checkPrime(num)) {
            System.out.println((int) num + " is a prime.");
        } else {
            System.out.println((int) num + " is not a prime.");
        }

        sc.close();
    }
}
