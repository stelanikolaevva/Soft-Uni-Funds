package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int sumOfNumbers = 0;

        for (int i = startNumber; i <= endNumber; i++) {
            System.out.print(i + " ");
            sumOfNumbers += i;
        }
        System.out.println();
        System.out.printf("Sum: %d", sumOfNumbers);

    }
}
