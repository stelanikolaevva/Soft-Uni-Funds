package Methods.Exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberRange = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberRange; i++) {
            int number = i;

            boolean containsOddDigit = false;
            int sum = 0;
            while (number != 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
                if (isOdd(digit)) {
                    containsOddDigit = true;
                }
            }
            boolean isDivisible = sumIsDivisibleBy8(sum);
            if (isDivisible && containsOddDigit) {
                System.out.println(i);
            }

        }
    }

    private static boolean sumIsDivisibleBy8(int sum) {
        return sum % 8 == 0;
    }

    private static boolean isOdd(int digit) {
        return digit % 2 != 0;
    }
}
