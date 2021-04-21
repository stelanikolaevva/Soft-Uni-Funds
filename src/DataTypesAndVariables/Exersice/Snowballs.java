package DataTypesAndVariables.Exersice;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maxSnowballValue = Integer.MIN_VALUE;
        String output = "";

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue =Math.pow(1.0*snowballSnow/snowballTime,snowballQuality);
            if(snowballValue>maxSnowballValue){
                output=String.format("%d : %d = %.0f (%d)",snowballSnow,snowballTime,snowballValue,snowballQuality);
                maxSnowballValue=snowballValue;
            }
        }
        System.out.println(output);
    }
}
