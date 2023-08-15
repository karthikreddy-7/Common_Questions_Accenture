import java.util.*;

public class LargeSmallSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evenmax = 0;
        int oddmax = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && arr[i] > evenmax) {
                evenmax = arr[i];
            } else if (i % 2 != 0 && arr[i] > oddmax) {
                oddmax = arr[i];
            }
        }
        int twoevenmax = 0;
        int twooddmax = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && arr[i] > twoevenmax && arr[i] < evenmax) {
                twoevenmax = arr[i];
            } else if (i % 2 != 0 && arr[i] > twooddmax && arr[i] < oddmax) {
                twooddmax = arr[i];
            }
        }
        System.out.println("the sum of 2nd largest even and odd indexes is: " + (twoevenmax + twooddmax));
        sc.close();
    }

}
