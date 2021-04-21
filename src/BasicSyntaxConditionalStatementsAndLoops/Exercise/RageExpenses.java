package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double totalExpenses = 0.0;


        int headsetCrashed = lostGames / 2;
        int mouseCrashed = lostGames / 3;
        int keyboardCrashed = lostGames / 6;
        int displayTrashed = keyboardCrashed / 2;

        totalExpenses += headsetCrashed * headsetPrice; //every second - headset
        totalExpenses += mouseCrashed * mousePrice; //every third - mouse
        totalExpenses += keyboardCrashed * keyboardPrice;
        totalExpenses += displayTrashed * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);
    }
}
