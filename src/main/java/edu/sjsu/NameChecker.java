package edu.sjsu;

public class NameChecker {
    /**
     * Checks whether a given string conforms to specific naming criteria.
     *
     * @param input The string to be checked for validity.
     * @return True if the input string meets the specified criteria, otherwise false.
     */
    public static boolean check(String input) {
        if (input == null || input.length() < 2 || input.length() > 40) {
            return false;
        }

        String regex = "^[A-Za-z]([A-Za-z]|(?<!-)-(?=[A-Za-z])|'(?=[A-Za-z]))*[A-Za-z]$";

        return input.matches(regex);
    }
}
