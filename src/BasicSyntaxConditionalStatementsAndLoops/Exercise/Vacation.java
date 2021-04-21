package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupPeople = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String dayWeek = scanner.nextLine();

        double totalPrice = 0.0;

        switch (typeGroup) {
            case "Students":
                if (dayWeek.equals("Friday")) {
                    totalPrice = groupPeople * 8.45;
                } else if (dayWeek.equals("Saturday")) {
                    totalPrice = groupPeople * 9.80;
                } else if (dayWeek.equals("Sunday")) {
                    totalPrice = groupPeople * 10.46;
                }
                if (groupPeople >= 30) totalPrice *= 0.85;
                break;
            case "Business":
                if (dayWeek.equals("Friday")) {
                    totalPrice = groupPeople * 10.90;
                } else if (dayWeek.equals("Saturday")) {
                    totalPrice = groupPeople * 15.60;
                } else if (dayWeek.equals("Sunday")) {
                    totalPrice = groupPeople * 16;
                }
                if (groupPeople >= 100) {
                    if (dayWeek.equals("Friday")) {
                        totalPrice -= 10 * 10.90;
                    } else if (dayWeek.equals("Saturday")) {
                        totalPrice -= 10 * 15.60;
                    } else if (dayWeek.equals("Sunday")) {
                        totalPrice -= 10 * 16;
                    }
                }
                break;
            case "Regular":
                if (dayWeek.equals("Friday")) {
                    totalPrice = groupPeople * 15;
                } else if (dayWeek.equals("Saturday")) {
                    totalPrice = groupPeople * 20;
                } else if (dayWeek.equals("Sunday")) {
                    totalPrice = groupPeople * 22.50;
                }
                if (groupPeople >= 10 && groupPeople <= 20) totalPrice *= 0.95;
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
