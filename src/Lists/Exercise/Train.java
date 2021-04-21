package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] command = line.split(" ");
            if (command[0].equals("Add")) {
                int passengers = Integer.parseInt(command[1]);
                wagons.add(passengers);
            } else {
                int passengers = Integer.parseInt(command[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    boolean isBigEnough = (passengers + wagons.get(i)) <= maxCapacity;
                    if (isBigEnough) {
                        wagons.set(i, passengers + wagons.get(i));
                        break;
                    }
                }
            }
            line = scanner.nextLine();
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));


    }
}
