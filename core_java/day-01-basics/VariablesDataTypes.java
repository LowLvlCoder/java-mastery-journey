public class VariablesDataTypes {
    public static void main(String[] args) {
        byte num = 125;
        short num0 = 32767;
        int num1 = 36500;
        long num3 = 9223372036854775807L;
        float flt = 34567.5334563f;
        double dbl = 5263456.3412441434d;
        char ch = 'a';
        String str = "Ashwani Kumar Puri";
        short wideCast = num;
        byte narrowCast = (byte) num0;

        System.out.println(num + "\n" + num0 + "\n" + num1 + "\n" + num3 + "\n" + flt + "\n" + dbl + "\n" + ch + "\n"
                + str + "\n" + wideCast + "\n" + narrowCast);
    }
}
