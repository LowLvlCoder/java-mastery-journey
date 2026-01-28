public class VariableSwap {

    public static void main(String[] args) {
        int a = 35;
        int b = 65;
        int temp;

        System.out.println("Swapping variable without temp variable:");
        System.out.println("Values before swapping: " + a + "," + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Values after  swapping: " + a + "," + b);

        System.out.println("\n");
        System.out.println("Swapping variable with temp variable:");
        System.out.println("Values before swapping: " + a + "," + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("Values after  swapping: " + a + "," + b);
    }
}
