import java.util.Scanner;

public class adam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Nth day:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i * i;
        }
        System.out.println("the total charity given by adam is " + sum);
        sc.close();

    }

}
