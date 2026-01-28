import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculating Simple Interest");
        System.out.print("Enter the principal amount: ");
        long pAmt = sc.nextLong();
        System.out.print("Enter the rate of interest: ");
        float rateOfInt = sc.nextFloat();
        System.out.print("Enter the time (in years) : ");
        byte time = sc.nextByte();

        double SimpleInterest = (pAmt * rateOfInt * time) / 100;

        System.out.println("Simple Interest = " + SimpleInterest);

        sc.close();
    }
}
