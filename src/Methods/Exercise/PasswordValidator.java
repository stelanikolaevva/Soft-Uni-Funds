package Methods.Exercise;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetterOrDigit;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        isValidate(password);
    }

    private static void isValidate(String password) {
        boolean notValid = false;
        if (!isLongEnough(password)) {
            System.out.println("Password must be between 6 and 10 characters");
            notValid = true;
        }
        if (!isOnlyOfLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
            notValid = true;
        }
        if (!containsAtLeastTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
            notValid = true;
        }

        if (!notValid) {
            System.out.println("Password is valid");
        }
    }

    private static boolean isLongEnough(String password) {
        return (password.length() >= 6 && password.length() <= 10);
    }

    private static boolean isOnlyOfLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsAtLeastTwoDigits(String password) {
        int digitsCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (isDigit(password.charAt(i))) {
                digitsCount++;
            }
        }
        return digitsCount >= 2;
    }
}
