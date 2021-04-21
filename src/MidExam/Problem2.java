package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sugarCubes = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!line.equals("Mort")) {
            String[] commandsGiven = line.split("\\s+");
            String command = commandsGiven[0];
            int value = Integer.parseInt(commandsGiven[1]);

            switch (command) {
                case "Add":
                    sugarCubes.add(value);
                    break;

                case "Remove":
                    sugarCubes.remove(Integer.valueOf(value));
                    break;

                case "Replace":
                    int replacementValue = Integer.parseInt(commandsGiven[2]);
                    replace(sugarCubes, value, replacementValue);
                    break;

                case "Collapse":
                    collapse(sugarCubes, value);
            }
            line = scanner.nextLine();
        }
        System.out.println(sugarCubes.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void replace(List<Integer> sugarCubes, int value, int replacementValue) {
        int firstOccurrence = sugarCubes.indexOf(value);
        if (firstOccurrence != -1) {
            sugarCubes.set(firstOccurrence, replacementValue);
        }
    }

    private static void collapse(List<Integer> sugarCubes, int value) {
        for (int i = 0; i < sugarCubes.size(); i++) {
            if (sugarCubes.get(i) < value) {
                sugarCubes.remove(i);
                i = -1;
            }
        }
    }

}
