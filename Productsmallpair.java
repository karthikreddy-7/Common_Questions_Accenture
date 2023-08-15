import java.util.Scanner;

public class Productsmallpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the product of the given smallest integers: " + productsmall(sum, arr));
        sc.close();
    }

    public static int productsmall(int sum, int[] arr) {
        int small1 = arr[0];
        int w = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small1) {
                small1 = arr[i];
                w = i;
            }
        }
        int small2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (i != w && arr[i] < small2) {
                small2 = arr[i];
            }
        }
        return small1 * small2;
    }

}
