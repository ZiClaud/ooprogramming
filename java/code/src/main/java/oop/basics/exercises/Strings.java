package oop.basics.exercises;

/**
 * You can find many more here:
 * https://www.w3resource.com/java-exercises/string/index.php
 * Code -> Folding -> Collapse All
 * Code -> Folding -> Expand Doc Comments
 */
public class Strings {
    /**
     * Write a function accepting 2 strings
     * and returning a single String representing
     * the concatenation of them
     */
    public static String concatenate_simple(String s1, String s2) {

        return s1 + s2;
    }

    /**
     * Write a function accepting a string[]
     * and returning a single String representing
     * the concatenation of all Strings of the array
     */
    public static String concatenate(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }

    /**
     * Write a function accepting a string a returning
     * the same string but reversed
     */
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();

        // more compact version
        // return new StringBuilder(s).reverse().toString();
    }

    /**
     * Write a function accepting a string
     * and returning the string without the first two characters.
     */
    public static String removeFirstTwoChars(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < s.length(); i++) {
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    /**
     * Write a function accepting a string
     * and returning the string without the first two characters.
     * Keep the first character if it is 'H' and
     * keep the second character if it is 'e'.
     */
    public static String removeFirstTwoCharsIf(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                if (s.charAt(i) == 'H') {
                    sb.append(s.charAt(i));
                }
            } else if (i == 1) {
                if (s.charAt(i) == 'e') {
                    sb.append(s.charAt(i));
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    /**
     * Write a function accepting a string
     * and returning true if "good" appears
     * at the beginning of the string
     * see startsWith() method
     */
    public static boolean goodAtTheBeginning(String s) {
        return s.startsWith("good");
    }

    /**
     * Write a function accepting a string
     * and returning true if "good" appears
     * at the beginning of the string
     * without using the startsWith() method
     */
    public static boolean goodAtTheBeginningHard(String s) {
        return (s.charAt(0) == 'g' && s.charAt(1) == 'o' && s.charAt(2) == 'o' && s.charAt(3) == 'd');
    }

    /**
     * Write a function accepting a string
     * and returning true if "good" appears
     * starting at index 0 or 1 in the given string.
     * see substring() method
     */
    public static boolean goodAtTheBeginningExt(String s) {
        String a = s.substring(0, 4);
        String b = s.substring(1, 5);
        return a.equals("good") || b.equals("good");
    }

    /**
     * Write a function accepting a string
     * and returning the same string (trimmed of the first and last characters) if the first or last characters are equal
     * or returning the same string (without trimming anything) otherwise
     * see substring(), charAt() methods
     */
    public static String removeFirstLast(String s) {
        String output;
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            output = s.substring(1, s.length() - 1);
        } else {
            output = s;
        }
        return output;
    }

    /**
     * Write a function accepting a string
     * and returning all duplicate characters contained as a char[]
     * see StringBuilder methods
     */
    public static char[] duplicateChars(String input) {
        StringBuilder seen = new StringBuilder();
        StringBuilder duplicates = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            String tmp = String.valueOf(input.charAt(i));
            if (seen.toString().contains(tmp) && !duplicates.toString().contains(tmp)) {
                duplicates.append(tmp);
            } else {
                seen.append(tmp);
            }
        }
        return duplicates.toString().toCharArray();
    }

    /**
     * Write a function accepting a string
     * and returning true if the string is a palindrome.
     * see StringBuilder methods
     */
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        } else {
            String reversedString = new StringBuilder(s).reverse().toString();
            return reversedString.equalsIgnoreCase(s);
        }
    }
}
