package Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> onTheList = new ArrayList<>();
        int commands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commands; i++) {
            String line = scanner.nextLine();

            String[] tokens = line.split("\\s+");
            String name = tokens[0];
            boolean isInTheList = onTheList.contains(name);

            if (tokens[2].equals("not")) {
                if (isInTheList) {
                    onTheList.remove(tokens[0]);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            } else if (tokens[2].equals("going!")) {
                if (isInTheList) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    onTheList.add(name);
                }
            }
        }
        for (String guest : onTheList) {
            System.out.println(guest);
        }

    }
}
