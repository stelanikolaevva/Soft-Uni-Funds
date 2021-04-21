package DataTypesAndVariables.Labs;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersRange = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= numbersRange; number++) {
            int current = number;
            int sum = 0;
            while (current != 0) {
                sum += current % 10;
                current = current / 10;
            }
            boolean isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecial) {
                System.out.printf("%d -> %s%n", number, "True");
            } else {
                System.out.printf("%d -> %s%n", number, "False");

            }
        }


    }
}
