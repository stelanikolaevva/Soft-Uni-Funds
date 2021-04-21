package BasicSyntaxConditionalStatementsAndLoops.Labs;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        String output= "";
        if (age>64 && age <= 122) {
            if (day.equals("Weekday")) {
                output += 12+"$";
            } else if (day.equals("Weekend")) {
                output += 15+"$";
            } else if (day.equals("Holiday")) {
                output += 10+"$";
            }
        } else if (age>18 && age <= 64) {
            if (day.equals("Weekday")) {
                output += 18+"$";
            } else if (day.equals("Weekend")) {
                output += 20+"$";
            } else if (day.equals("Holiday")) {
                output += 12+"$";
            }
        } else if (age>=0 && age <= 18) {
            if (day.equals("Weekday")) {
                output += 12+"$";
            } else if (day.equals("Weekend")) {
                output += 15+"$";
            } else if (day.equals("Holiday")) {
                output += 5+"$";
            }
        } else {
            System.out.println("Error!");
        }
        if(!output.equals("")){
            System.out.println(output);
        }
    }
}
