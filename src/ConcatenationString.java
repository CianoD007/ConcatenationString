import java.util.Scanner;

public class ConcatenationString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Input second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Concatenate strings
        String concatenatedString1 = firstString + secondString;
        String concatenatedString2 = secondString + firstString;

        // Output concatenated strings
        System.out.println("Concatenated string 1: " + concatenatedString1);
        System.out.println("Concatenated string 2: " + concatenatedString2);

        // Check if the composition is alternating
        boolean isAlternating = checkAlternating(concatenatedString1);
        System.out.println("Composition is alternating: " + isAlternating);

        scanner.close();
    }

    // Method to check if the composition of two different strings is alternating
    public static boolean checkAlternating(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 2)) {
                return false; // Characters are not alternating
            }
        }
        return true; // Characters are alternating
    }
}
