public class InfiniteLoop {
    public static void main(String[] args) {
        int count = 1;

        for (int i = 1; i <= 10; i = i + 0) {
            System.out.println("This is an infinite for loop");
        }

        while (true) {
            System.out.println("Hi!!!");
            count++;
            if (count == 1000000) {
                break;
            }
        }
    }
}
