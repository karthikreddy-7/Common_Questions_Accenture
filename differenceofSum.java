import java.util.Scanner;

public class differenceofSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter M :");
        int m = sc.nextInt();
        System.out.println("enter N :");
        int n = sc.nextInt();
        System.out.println("the difference of the sum is : " + diffSum(n, m));
        sc.close();
    }

    static int diffSum(int n, int m) {
        int div = 0;
        int notdiv = 0;
        for (int i = 1; i <= n; i++) {
            // if it is divisible then its modulo with m will be zero
            if (i % m == 0) {
                // adding the div sum
                div += i;
            } else {
                // not divisble by m , adding the not div sum
                notdiv += i;
            }
        }
        return notdiv - div;
    }

}
