package allPrograms;
import java.util.Scanner;

public class program23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        String formatted = toLowerCaseAndRemoveSpaces(original);

        String reversed = reverseString(formatted);

        if (formatted.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }

        scanner.close();
    }

    private static String toLowerCaseAndRemoveSpaces(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ' ') {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();
    }

    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
