package DataTypesAndVariables.Exersice;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int firstNumber=Integer.parseInt(scanner.nextLine());
        int secondNumber=Integer.parseInt(scanner.nextLine());
        int thirdNumber=Integer.parseInt(scanner.nextLine());
        int fourthNumber=Integer.parseInt(scanner.nextLine());

        int sumOfTwo=firstNumber+secondNumber;
        double total=1.0*sumOfTwo/thirdNumber*fourthNumber;
        System.out.printf("%.0f",total);
    }
}
