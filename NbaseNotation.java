import java.util.Scanner;

public class NbaseNotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        String s = "";
        while (dividend > 0) {
            int remainder = dividend % divisor;
            s = Nbase(remainder) + s;

            dividend = dividend / divisor;
        }
        System.out.println(s);
        sc.close();
    }

    static String Nbase(int n) {
        String m = "";
        if (n < 10) {
            m = Integer.toString(n);
            return m;
        } else {
            int e = n + 55;
            m = Character.toString((char) e);
            return m;
        }
    }

}
