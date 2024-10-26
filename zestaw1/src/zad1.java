//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class zad1 {
    public static int compareTo(String str1, String anotherString) {
        int minLength = Math.min(str1.length(), anotherString.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != anotherString.charAt(i)) {
                return str1.charAt(i) - anotherString.charAt(i);
            }
        }
        return str1.length() - anotherString.length();
    }

    // Implementacja endsWith
    public static boolean endsWith(String str, String suffix) {
        if (suffix.length() > str.length()) {
            return false;
        }
        for (int i = 0; i < suffix.length(); i++) {
            if (str.charAt(str.length() - suffix.length() + i) != suffix.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Implementacja indexOf
    public static int indexOf(String str, String substr) {
        if (substr.length() > str.length()) {
            return -1;
        }
        for (int i = 0; i <= str.length() - substr.length(); i++) {
            int j = 0;
            while (j < substr.length() && str.charAt(i + j) == substr.charAt(j)) {
                j++;
            }
            if (j == substr.length()) {
                return i;
            }
        }
        return -1;
    }

    // Implementacja replace
    public static String replace(String str, char oldChar, char newChar) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == oldChar) {
                result.append(newChar);
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    // Implementacja substring
    public static String substring(String str, int beginIndex) {
        if (beginIndex < 0 || beginIndex >= str.length()) {
            throw new IndexOutOfBoundsException("Index: " + beginIndex + ", Length: " + str.length());
        }
        StringBuilder result = new StringBuilder();
        for (int i = beginIndex; i < str.length(); i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Testowanie metod

        // Test compareTo
        System.out.println(compareTo("aaa", "aab")); // Wynik: -1
        System.out.println(compareTo("aaa", "aaa")); // Wynik: 0
        System.out.println(compareTo("aab", "aaa")); // Wynik: 1

        // Test endsWith
        System.out.println(endsWith("Hello", "lo")); // Wynik: true
        System.out.println(endsWith("Hello", "oo")); // Wynik: false

        // Test indexOf
        System.out.println(indexOf("Hello", "ll")); // Wynik: 2
        System.out.println(indexOf("Hello", "oo")); // Wynik: -1

        // Test replace
        System.out.println(replace("Hello", 'l', 'p')); // Wynik: Heppo

        // Test substring
        System.out.println(substring("Hello", 2)); // Wynik: llo
    }
}