import java.util.*;

public class AnagramCheck {
    
    // Function to clean text: remove punctuation & spaces, convert to lowercase
    public static String cleanString(String text) {
        return text.replaceAll("[^\\p{L}]", "").toLowerCase();
    }

    // Function to check anagram
    public static boolean isAnagram(String s1, String s2) {
        s1 = cleanString(s1);
        s2 = cleanString(s2);

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("\nRESULT: The strings are ANAGRAMS.");
        } else {
            System.out.println("\nRESULT: The strings are NOT anagrams.");
        }
    }
}
