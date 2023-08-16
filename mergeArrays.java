import java.util.*;

public class mergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array1: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the size of array2:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[n + n2];
        for (int i = 0; i < n; i++) {
            arr3[i] = arr[i];
        }
        for (int i = n; i < n + n2; i++) {
            arr3[i] = arr2[i - n];
        }
        System.out.println();
        // bubble sort:
        for (int i = 0; i < n + n2; i++) {
            for (int j = 0; j < n + n2 - i - 1; j++) {
                if (arr3[j] > arr3[j + 1]) {
                    int temp = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        sc.close();

    }

}
