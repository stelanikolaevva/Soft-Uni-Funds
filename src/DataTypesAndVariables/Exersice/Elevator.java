package DataTypesAndVariables.Exersice;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f",Math.ceil(1.0*people/capacity));
    }
}
