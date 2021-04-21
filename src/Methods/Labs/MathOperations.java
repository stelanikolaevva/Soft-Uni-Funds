package Methods.Labs;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double secondNumber = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f",calculate(firstNumber, operator, secondNumber));

    }

    private static double calculate(double firstNumber, char operator, double secondNumber) {
        if (operator == '/') {
            return divide(firstNumber, secondNumber);
        } else if (operator == '*') {
            return multiply(firstNumber, secondNumber);
        } else if (operator == '+') {
            return add(firstNumber, secondNumber);
        } else if (operator == '-') {
            return subtract(firstNumber, secondNumber);
        }
        return 0;
    }


    private static double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    private static double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    private static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    private static double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}
