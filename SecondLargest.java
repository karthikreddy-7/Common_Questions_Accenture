import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int secondmax = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondmax && arr[i] < max) {
                secondmax = arr[i];
            }
        }
        System.out.println("the second largest element in the array is " + secondmax);
        sc.close();
    }

}
