package DataTypesAndVariables.Exersice;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (char k = (char) start; k <= (char) end; k++) {
            System.out.print(k + " ");
        }

    }
}
