import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m:");
        int m = sc.nextInt();
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("the result of the operation is: " + cal(m, n));
        sc.close();
    }

    static int cal(int m, int n) {
        int sum = 0;
        for (int i = m; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
