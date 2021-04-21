package Methods.Exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int firstNumber=Integer.parseInt(scanner.nextLine());
        int secondNumber=Integer.parseInt(scanner.nextLine());

        double result = divisionOfFactorials(firstNumber,secondNumber);
        System.out.printf("%.2f",result);
    }

    private static double divisionOfFactorials(int firstNumber, int secondNumber) {
        double a = factorial(firstNumber);
        double b = factorial(secondNumber);
        return a/b;
    }

    private static double factorial(int number) {
        double factorial=1;
        for (int i = 1; i <= number ; i++) {
            factorial*=i;
        }
        return factorial;
    }
}
