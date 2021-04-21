package DataTypesAndVariables.Exersice;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            for (int k = 0; k < number; k++) {
                for (int m = 0; m < number; m++) {
                    System.out.printf("%c%c%c%n", (char) ('a' + i), (char) ('a' + k), (char) ('a' + m));
                }
            }
        }
    }
}
