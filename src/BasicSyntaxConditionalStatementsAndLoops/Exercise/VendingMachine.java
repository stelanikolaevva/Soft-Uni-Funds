package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = "";
        double coins = 0.0;
        double sumOfCoins = 0.0;
        line = scanner.nextLine();
        while (!line.equals("Start")) {
            coins = Double.parseDouble(line);
            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2) {
                System.out.printf("Cannot accept %.2f%n", coins);
            } else {
                sumOfCoins += coins;
            }
            line = scanner.nextLine();
        }
        while (true) {
            line = scanner.nextLine();
            if (line.equals("End")) {
                break;
            }
            switch (line) {
                case "Nuts":
                    if (sumOfCoins - 2.0 >= 0) {
                        sumOfCoins -= 2.0;
                        System.out.println("Purchased Nuts");
                    } else System.out.println("Sorry, not enough money ");
                    break;
                case "Water":
                    if (sumOfCoins - 0.7 >= 0) {
                        sumOfCoins -= 0.7;
                        System.out.println("Purchased Water");
                    } else System.out.println("Sorry, not enough money ");
                    break;
                case "Crisps":
                    if (sumOfCoins - 1.5 >= 0) {
                        sumOfCoins -= 1.5;
                        System.out.println("Purchased Crisps");
                    } else System.out.println("Sorry, not enough money ");
                    break;
                case "Soda":
                    if (sumOfCoins - 0.8 >= 0) {
                        sumOfCoins -= 0.8;
                        System.out.println("Purchased Soda");
                    } else System.out.println("Sorry, not enough money ");
                    break;
                case "Coke":
                    if (sumOfCoins - 1.0 >= 0) {
                        sumOfCoins -= 1.0;
                        System.out.println("Purchased Coke");
                    } else System.out.println("Sorry, not enough money ");
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

        }
        System.out.printf("Change: %.2f", sumOfCoins);
    }

}
