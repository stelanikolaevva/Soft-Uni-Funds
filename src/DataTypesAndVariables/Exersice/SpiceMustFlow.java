package DataTypesAndVariables.Exersice;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spiceRate = Integer.parseInt(scanner.nextLine());
        spiceRate = Math.abs(spiceRate);
        long spiceMined = 0;
        int days = 0;
        int crewConsumption=26;

        if (spiceRate >= 100) {
            while (spiceRate >= 100) {
                spiceMined += spiceRate - crewConsumption;
                spiceRate -= 10;
                days++;
            }
            spiceMined -= crewConsumption;
        }
        System.out.println(days);
        System.out.println(spiceMined);

    }
}
