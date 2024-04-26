package edu.sjsu;

public class NameChecker {
    /**
     * Checks if a given string is a valid name following these rules:
     * - Between 2 to 40 characters
     * - Contains only alphabetic characters, non-consecutive hyphens, or a single quote
     * - Cannot start with a hyphen or single quote
     *
     * @param input Name to check
     * @return True if input is a valid name, else false
     */
    public static boolean check(String input) {
        // Check if input length is between 2 to 40 characters
        if (input.length() < 2 || input.length() > 40) {
            return false;
        }

        // Check if input contains only alphabetic characters, non-consecutive hyphens, or a single quote
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isLetter(ch) && ch != '-' && ch != '\'') {
                return false;
            }

            // Check for consecutive hyphens or single quotes
            if ((ch == '-' || ch == '\'') && i > 0 && input.charAt(i - 1) == ch) {
                return false;
            }

            // Check if input starts with a hyphen or single quote
            if (i == 0 && (ch == '-' || ch == '\'')) {
                return false;
            }
        }

        return true;
    }

    // Test the method
    public static void main(String[] args) {
        // Test cases
        String[] testNames = {"John-Doe", "Jane O'Brien", "-Invalid", "Invalid-", "Bob--Smith", "James'O'Connor",
                "abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy", // 41 characters
                ""}; // Empty string

        // Output the result for each test case
        for (String name : testNames) {
            System.out.println(name + ": " + check(name));
        }
    }
}
