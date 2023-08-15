import java.util.*;

public class passwordchecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String s = sc.nextLine();
        if (ispass(s)) {
            System.out.println("password is valid.");
        } else {
            System.out.println("password is invalid.");
        }
        sc.close();
    }

    static boolean ispass(String s) {
        if (Character.isDigit(s.charAt(0))) {
            return false;
        }
        if (s.length() < 4) {
            return false;
        }
        boolean digit = false;
        boolean capital = false;
        boolean spaces = true;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                digit = true;
            }
            if (Character.isUpperCase(s.charAt(i))) {
                capital = true;
            }
        }
        if (s.contains(" ") || s.contains("/")) {
            spaces = false;
        }
        if (digit && capital && spaces) {
            return true;
        } else {
            return false;
        }
    }

}
