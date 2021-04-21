package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int factorial = 1;
        int totalSum = 0;

        int digits = number;
        while (digits != 0) {
            factorial = 1;
            for (int i = 1; i <= digits % 10; i++) {
                factorial *= i;
            }
            totalSum += factorial;
            digits /= 10;
        }
        if (totalSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
