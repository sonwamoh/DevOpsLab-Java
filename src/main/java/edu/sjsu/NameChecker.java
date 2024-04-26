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
        if (input.length() < 2 || input.length() > 40) {
            return false;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isLetter(ch) && ch != '-' && ch != '\'') {
                return false;
            }

            if ((ch == '-' || ch == '\'') && i > 0 && input.charAt(i - 1) == ch) {
                return false;
            }

            if (i == 0 && (ch == '-' || ch == '\'')) {
                return false;
            }
        }

        return true;
    }

   
}
