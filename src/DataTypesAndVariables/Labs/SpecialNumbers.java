package DataTypesAndVariables.Labs;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberRange = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberRange; i++) {

            int sum = 0;
            int currentNumber = i;

            while (currentNumber  != 0) {
                sum += currentNumber % 10;
                currentNumber = currentNumber / 10;
            }


            if (sum != 5 && sum != 7 && sum != 11) {
                System.out.println(i + " -> False");
            } else {
                System.out.println(i + " -> True");
            }
        }
    }
}
