package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        int timesGuessed = 1;

        StringBuilder rightPassword = new StringBuilder();
        rightPassword.append(username);
        rightPassword.reverse();

        String password = rightPassword.toString();
        String command = scanner.nextLine();

        while (!command.equals(password)) {
            System.out.println("Incorrect password. Try again.");
            command = scanner.nextLine();
            timesGuessed++;
            if (timesGuessed == 4) {
                break;
            }
        }
        if (timesGuessed == 4) {
            System.out.printf("User %s blocked!", username);
        } else {
            System.out.printf("User %s logged in.", username);
        }
    }
}
