import java.util.Scanner;
import java.util.HashMap;

public class anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String x = sc.nextLine();
        System.out.print("Enter the second string: ");
        String y = sc.nextLine();
        if (!isanagrams(x, y)) {
            System.out.println("they are not anagrams !!");
        } else {
            System.out.println("they are anagrams !!");
        }
        sc.close();
    }

    static boolean isanagrams(String x, String y) {
        if (x.length() != y.length()) {
            return false;
        }
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < y.length(); i++) {
            char c = y.charAt(i);
            if (!frequency.containsKey(c)) {
                return false;
            }
            frequency.put(c, frequency.get(c) - 1);
            if (frequency.get(c) == 0) {
                frequency.remove(c);
            }
        }
        return frequency.isEmpty();
    }

}
