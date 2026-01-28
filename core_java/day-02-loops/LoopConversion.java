public class LoopConversion {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        while (i <= 5) {
            System.out.println(i + " ");
            i += 2;
        }
        do {
            System.out.println(j + " ");
            j += 2;
        } while (j <= 5);
    }
}
