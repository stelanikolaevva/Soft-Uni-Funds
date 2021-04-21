package DataTypesAndVariables.Labs;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String cityName= scanner.nextLine();
        long population=(long)(Integer.parseInt(scanner.nextLine()));
        double area=Double.parseDouble(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %.0f square km.",cityName,population,area);
    }
}
