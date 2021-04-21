package DataTypesAndVariables.Labs;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double poundsBritish=Double.parseDouble(scanner.nextLine());
        double convertValue=1.31;
        double dollarsUS=poundsBritish*convertValue;
        System.out.printf("%.3f",dollarsUS);
    }
}
