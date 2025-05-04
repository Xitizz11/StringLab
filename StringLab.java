import java.util.Scanner;

public class StringLab {
    public static void main(String[] args) {
        // Task 1: Working with String Methods
        String original = " Welcome to the Java String Lab! ";
        System.out.println("Original string: \"" + original + "\"");

        // 1. length()
        System.out.println("Length: " + original.length());

        // 2. charAt()
        System.out.println("Character at index 7: " + original.charAt(7));

        // 3. substring()
        System.out.println("Substring (\"Java\"): " + original.substring(18, 22));

        // 4. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + original.toUpperCase());
        System.out.println("Lowercase: " + original.toLowerCase());

        // 5. indexOf()
        System.out.println("Index of \"Java\": " + original.indexOf("Java"));

        // 6. contains()
        System.out.println("Contains \"Lab\": " + original.contains("Lab"));

        // 7. replace()
        System.out.println("Replace \"Java\" with \"Java Programming\": " + original.replace("Java", "Java Programming"));

        // 8. split()
        System.out.println("Split by spaces:");
        String[] words = original.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }

        // 9. trim()
        System.out.println("Trimmed string: \"" + original.trim() + "\"");

        // 10. equals() and equalsIgnoreCase()
        String compareStr = "java string lab!";
        System.out.println("Equals: " + original.equals(compareStr));
        System.out.println("Equals (ignore case): " + original.trim().equalsIgnoreCase(compareStr));

        // Task 2: Loop Challenges with Strings

        // 🌀 For Loop: Count Vowels
        int vowelCount = 0;
        String lowerCase = original.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Vowel Count: " + vowelCount);

        // 🔁 While Loop: Check for Palindrome
        String palindromeWord = "racecar";
        int left = 0;
        int right = palindromeWord.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (palindromeWord.charAt(left) != palindromeWord.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is \"" + palindromeWord + "\" a palindrome? " + isPalindrome);

        // 🔂 Do...While Loop: Input Validation
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do {
            System.out.print("Enter a sentence (must include the word 'Java'): ");
            userInput = scanner.nextLine();
        } while (!userInput.contains("Java"));
        System.out.println("Thank you!");
        scanner.close();

        // Task 3: Working with StringBuilder
        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java");
        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        sb.delete(sb.indexOf("Learning"), sb.indexOf("Learning") + "Learning".length());
        System.out.println("StringBuilder after modifications: " + sb);
        System.out.println("Reversed StringBuilder: " + sb.reverse());

        // Task 4: Working with StringBuffer
        StringBuffer sbf = new StringBuffer("Multithreading Lab");
        sbf.append(" - Learning Java");
        sbf.insert(sbf.indexOf("Lab") + 3, " is fun");
        sbf.delete(sbf.indexOf("Learning"), sbf.indexOf("Learning") + "Learning".length());
        System.out.println("StringBuffer after modifications: " + sbf);
        System.out.println("Reversed StringBuffer: " + sbf.reverse());
    }
}
