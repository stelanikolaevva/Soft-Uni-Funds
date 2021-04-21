package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyAmount = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        //every 6 belt - free
        //+10% more lightsabers rounded up
        double freeBelts = Math.floor(1.0 * studentsCount / 6);
        double totalPrice = lightsaberPrice * (Math.ceil(studentsCount * 1.1)) + robesPrice * (studentsCount) + beltsPrice * (studentsCount - freeBelts);
        if (totalPrice <= moneyAmount) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", totalPrice - moneyAmount);
        }
    }
}
