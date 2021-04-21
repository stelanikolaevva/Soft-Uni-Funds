package Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String evenOrOdd;
            String[] command = input.split(" ");
            switch (command[0]) {
                case "exchange":
                    int index = Integer.parseInt((command[1]));
                    if (index < 0 || index > array.length) {
                        System.out.println("Invalid index");
                    } else {
                        exchange(array, index);
                    }
                    break;
                case "max":
                case "min":
                    evenOrOdd = command[1];
                    minMaxValue(command[0], evenOrOdd);
                    break;
                case "first":
                case "last":
                    int count = Integer.parseInt((command[1]));
                    evenOrOdd = command[2];
                    printSymbols(command[0], evenOrOdd);
                    break;
            }

            input = scanner.nextLine();
        }
    }

    private static void exchange(int[] array, int index) {

        int[] newArray = new int[array.length];
        //first half
        for (int i = 0; i < array.length - index - 1; i++) {
            newArray[i] = array[i + index + 1];
            if ((array.length - index - 1) == 0) break;
        }
        //second half
        for (int i = array.length - index - 1; i < array.length; i++) {
            newArray[i] = array[i - index];
        }
        System.out.println(Arrays.toString(newArray));

    }

    private static void minMaxValue(String s, String evenOrOdd) {
    }

    private static void printSymbols(String s, String evenOrOdd) {

    }
}
