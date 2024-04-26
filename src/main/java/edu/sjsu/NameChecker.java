package edu.sjsu;

public class NameChecker {
    public static boolean check(String input) {
        if (input == null || input.length() < 2 || input.length() > 40) {
            return false;
        }
        String regex = "^[A-Za-z]([A-Za-z]|(?<!-)-(?=[A-Za-z])|'(?=[A-Za-z]))*[A-Za-z]$";
        return input.matches(regex);
    }
}
