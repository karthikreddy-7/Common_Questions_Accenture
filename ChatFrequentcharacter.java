import java.util.*;

public class ChatFrequentcharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("enter the character to replace : ");
        char x = sc.next().charAt(0);
        HashMap<Character, Integer> fre = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            fre.put(c, fre.getOrDefault(c, 0) + 1);
        }
        char maxfre = '\0';
        int intialfre = 0;
        for (char key : fre.keySet()) {
            if (fre.get(key) > intialfre) {
                maxfre = key;
                intialfre = fre.get(key);
            }
        }
        System.out.println("the most used character is: " + maxfre);
        System.out.println("replacing the most used character with the given character");
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == maxfre) {
                res = res + Character.toString(x);
            } else {
                res = res + s.charAt(i);
            }
        }
        System.out.println("replaced string is: " + res);
        sc.close();
    }

}
