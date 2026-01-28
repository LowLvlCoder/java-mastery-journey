import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms to print in the series: ");
        int terms = sc.nextInt();
        int t1 = 0, t2 = 1;
        for (int i = 0; i <= terms; i++) {
            int t3 = 0;
            if (i == 0) {
                System.out.print(t1 + " ");
            } else if (i == 1) {
                System.out.print(t2 + " ");
            } else {
                t3 = t2 + t1;
                t1 = t2;
                t2 = t3;
                System.out.print(t3 + " ");
            }
        }
        sc.close();
    }
}
