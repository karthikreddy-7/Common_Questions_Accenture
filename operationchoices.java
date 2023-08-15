import java.util.*;

public class operationchoices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a :");
        int a = sc.nextInt();
        System.out.println("enter the value of b :");
        int b = sc.nextInt();
        System.out.println("enter the value of c :");
        int c = sc.nextInt();
        System.out.println("the result is : " + opch(a, b, c));
        sc.close();
    }

    static int opch(int a, int b, int c) {
        if (c == 1) {
            return a + b;
        } else if (c == 2) {
            return a - b;
        } else if (c == 3) {
            return a * b;
        } else if (c == 4) {
            return a / b;
        }
        return -1;
    }

}
