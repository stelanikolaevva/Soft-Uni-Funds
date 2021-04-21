package DataTypesAndVariables.Exersice;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberLines = Integer.parseInt(scanner.nextLine());

        int filled = 0;
        for (int i = 0; i < numberLines; i++) {
            int litre = Integer.parseInt(scanner.nextLine());
            boolean isOverflow = (filled + litre) > 255;
            if (isOverflow) {
                System.out.println("Insufficient capacity!");
            } else {
                filled += litre;
            }
        }
        System.out.println(filled);
    }
}
