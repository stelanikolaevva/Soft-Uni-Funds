package Methods.Exercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            palindrome(command);
            command = scanner.nextLine();
        }
    }

    public static void palindrome(String command) {
        String reversed = new StringBuffer(command).reverse().toString();

        if (command.equals(reversed)) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
    }
}
