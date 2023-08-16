import java.util.*;

public class highestfrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> fre = new HashMap<>();
        for (int i = 0; i < n; i++) {
            fre.put(arr[i], fre.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(fre.entrySet());
        int max = 0;
        int maxrepeated = 0;
        for (int key : fre.keySet()) {
            if (fre.get(key) > max) {
                max = fre.get(key);
                maxrepeated = key;
            } else if (fre.get(key) >= max && key < maxrepeated) {
                max = fre.get(key);
                maxrepeated = key;
            }
        }
        System.out.println("the most repeated number is : " + maxrepeated);
        sc.close();
    }

}
