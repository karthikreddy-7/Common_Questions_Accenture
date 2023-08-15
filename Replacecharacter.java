import java.util.*;

public class Replacecharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("Enter the character to be replaced: ");
        char c1 = sc.next().charAt(0);
        System.out.println("Enter the character which replaces the odd character : ");
        char c2 = sc.next().charAt(0);
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c1) {
                res = res + Character.toString(c2);
            } else if (s.charAt(i) == c2) {
                res = res + Character.toString(c1);
            } else {
                res = res + Character.toString(s.charAt(i));
            }
        }
        System.out.println("the resultant string is : " + res);
        sc.close();
    }

}
