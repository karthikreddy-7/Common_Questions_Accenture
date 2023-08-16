import java.util.Scanner;

public class KthLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the Kth value:");
        int k = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        if (k > n) {
            System.out.println("Kth value is larger than the array !!");
        } else {
            System.out.println("the Kth largest value is : " + arr[n - k - 1]);
        }
        sc.close();

    }

}
