package Methods.Exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        printMiddle(line);

    }

    private static void printMiddle(String line) {
        int length = line.length();
        if (length % 2 == 0) {
            System.out.println(line.charAt(length / 2 - 1) + "" + line.charAt(length / 2));
        } else {
            System.out.println(line.charAt(length / 2));
        }
    }
}
