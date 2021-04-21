package Lists.Labs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "Contains":
                    int numberToContain = Integer.parseInt(tokens[1]);
                    if (numbers.contains(numberToContain)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (tokens[1].equals("even")) {
                        for (Integer number : numbers) {
                            if (number % 2 == 0) {
                                System.out.print(number + " ");
                            }
                        }
                    } else {
                        for (Integer number : numbers) {
                            if (number % 2 != 0) {
                                System.out.print(number + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer number : numbers) {
                        sum += number;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int numberToFilter = Integer.parseInt(tokens[2]);
                    switch (tokens[1]) {
                        case ">":
                            for (Integer number : numbers) {
                                if (number > numberToFilter) {
                                    System.out.print(number + " ");
                                }
                            }
                            break;
                        case ">=":
                            for (Integer number : numbers) {
                                if (number >= numberToFilter) {
                                    System.out.print(number + " ");
                                }
                            }
                            break;

                        case "<":
                            for (Integer number : numbers) {
                                if (number < numberToFilter) {
                                    System.out.print(number + " ");
                                }
                            }
                            break;
                        case "<=":
                            for (Integer number : numbers) {
                                if (number <= numberToFilter) {
                                    System.out.print(number + " ");
                                }
                            }
                            break;
                    }
                    System.out.println();


            }
            line = scanner.nextLine();
        }
    }
}
