package DataTypesAndVariables.Exersice;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());         //n
        int distance = Integer.parseInt(scanner.nextLine());          //m
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());  //y

        int countPoked = 0;
        //N-M while n>=m
        //n-m ->count++
        //if n === N%50 -  n/y between integers? ( not possible then subtract )
        //again subtract n-m while n>=m

        int power = pokePower;
        while (power >= distance) {
            power -= distance;
            countPoked++;
            double percentage = pokePower * 0.5;
            if (percentage == power) {
                power /= exhaustionFactor;
            }
        }
        System.out.println(power);
        System.out.println(countPoked);
    }
}
