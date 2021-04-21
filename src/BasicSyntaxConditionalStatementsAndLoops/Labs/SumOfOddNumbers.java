package BasicSyntaxConditionalStatementsAndLoops.Labs;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddNumbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i < oddNumbers * 2; i += 2) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
