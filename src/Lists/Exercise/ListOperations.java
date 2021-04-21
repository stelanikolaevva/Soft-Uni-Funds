package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");
            int boundsOfArray = input.size();
            switch (tokens[0]) {
                case "Add":
                    int number = Integer.parseInt(tokens[1]);
                    input.add(number);
                    break;
                case "Insert":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    int indexToAdd = Integer.parseInt(tokens[2]);
                    if (isInValidIndex(indexToAdd, boundsOfArray)) {
                        System.out.println("Invalid index");
                    } else {
                        input.add(indexToAdd, numberToAdd);
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    if (isInValidIndex(indexToRemove, boundsOfArray)) {
                        System.out.println("Invalid index");
                    } else {
                        input.remove(indexToRemove);
                    }
                    break;
                case "Shift":
                    String direction = tokens[1];
                    int count = Integer.parseInt(tokens[2]);

                    if (direction.equals("right")) {
                        for (int i = 1; i <= count; i++) {
                            int lastNumber = input.get(boundsOfArray - 1);
                            input.remove(boundsOfArray - 1);
                            input.add(0, lastNumber);
                        }
                    } else if (direction.equals("left"))
                        for (int i = 1; i <= count; i++) {
                            int firstNumber = input.get(0);
                            input.remove(0);
                            input.add(firstNumber);
                        }
                    break;
            }
            line = scanner.nextLine();
        }
        printList(input);

    }

    private static boolean isInValidIndex(int index, int boundsOfArray) {
        return index >= boundsOfArray || index < 0;
    }

    private static void printList(List<Integer> input) {
        for (Integer integer : input) {
            System.out.print(integer + " ");

        }
    }
}
