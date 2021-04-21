package Array.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs_NotDone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] initialIndex = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] field = new int[fieldSize];
        Arrays.fill(field, 0);

        for (int index : initialIndex) {
            if (index < fieldSize) {
                field[index] = 1;
            }
        }
        //show where are ladybugs
        System.out.println(Arrays.toString(field));

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            //each line - ladyBug command
            int ladybugIndex = Integer.parseInt(line.split(" ")[0]);
            String direction = line.split(" ")[1];
            int flyLength = Integer.parseInt(line.split(" ")[2]);

            while (ladybugContainsInField(ladybugIndex, field)) {
                    ladybugIndex = moveLadybug(ladybugIndex, direction, flyLength);
                }
            }
        }

    public static boolean ladybugContainsInField(int ladybugIndex, int[] field) {
        for (int index : field) {
            if (ladybugIndex == index) {
                return true;
            }
        }
        return false;
    }

    public static int moveLadybug(int ladybugIndex, String direction, int flyLength) {
        if (direction.equals("left")) {
            ladybugIndex -= flyLength;
        } else {
            ladybugIndex += flyLength;
        }
        return ladybugIndex;
    }
}
