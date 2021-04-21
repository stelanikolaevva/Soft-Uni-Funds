package Array.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] line = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 1;
        int maxCount = 0;
        int currentDigit = 0;

        for (int i = 0; i < line.length - 1; i++) {

            if (line[i] == line[i + 1]) {
                count++;

                if (count > maxCount) {
                    maxCount = count;
                    currentDigit = line[i];
                }

            } else {
                count = 1;
            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(currentDigit + " ");
        }
    }
}
