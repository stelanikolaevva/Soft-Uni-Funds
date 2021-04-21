package Methods.Labs;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(getMultiplyByEvenAndOddSum(number));

    }

    private static int getMultiplyByEvenAndOddSum(int number) {

        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);

        return evenSum * oddSum;
    }


    private static int getEvenSum(int number) {
        int n = number;
        int evenSum = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                evenSum += n % 10;
            }
            n = n / 10;
        }
        return evenSum;
    }

    private static int getOddSum(int number) {
        int n = number;
        int oddSum = 0;
        while (n != 0) {
            if (n % 2 != 0) {
                oddSum += n % 10;
            }
            n = n / 10;
        }
        return oddSum;
    }

}
