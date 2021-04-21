package RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<name>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        double sum = 0.0;
        String line = scanner.nextLine();
        System.out.println("Bought furniture:");
        while (!line.equals("Purchase")) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                sum += price * quantity;
                System.out.println(name);
            }

            line = scanner.nextLine();
        }
        System.out.printf("Total money spend: %.2f", sum);
    }
}
