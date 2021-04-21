package Methods.Exercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        printSumAndSub(firstNumber, secondNumber, thirdNumber);
    }

    private static void printSumAndSub(int firstNumber, int secondNumber, int thirdNumber) {
        int a = sum(firstNumber, secondNumber);
        int b = sub(a, thirdNumber);
        System.out.println(b);
    }

    private static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static int sub(int a, int thirdNumber) {
        return a - thirdNumber;
    }
}
