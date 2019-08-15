package ReverseString;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String s = "This is very cool string!";

        // Better
        // O(n) - Time complexity
        // O(n) - Space complexity
        System.out.println(reverseString(s));


        // Best
        // O(n) - Time complexity
        // O(n) - Space complexity
        System.out.println(reverseString3(s));


        // Using reverse()
        System.out.println(reverseString4(s));

        // Using recurse
        // O(n) - Time complexity
        System.out.println(reverseStringRecurse(s));
    }

    private static String reverseString(String s) {
        StringBuilder backwards = new StringBuilder();

        String[] chars = s.split("");

        for (int i = chars.length - 1; i >= 0; i--) {
            backwards.append(chars[i]);
        }

        return backwards.toString();
    }

    private static String reverseString3(String s) {
        if (s.isEmpty() || s.length() < 2) {
            return "The string is empty or lower then 2 chars!";
        }

        StringBuilder backwards = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            backwards.append(s.charAt(i));
        }

        return backwards.toString();
    }

    private static String reverseString4(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    private static String reverseStringRecurse(String s) {
        if (s.isEmpty()) {
            return "";
        }

        return reverseStringRecurse(s.substring(1)) + s.charAt(0);
    }

}
