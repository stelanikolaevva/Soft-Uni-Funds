package Array.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory_NotDone {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lengthOfDNA = Integer.parseInt(scanner.nextLine());


        int sequenceIndex = 0;
        int bestSequenceIndex = 1;
        int maxCount = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int leftmostIndex = Integer.MIN_VALUE;

        String line = scanner.nextLine();
        while (!line.equals("Clone them!")) {
            int[] numbers = Arrays.stream(line.split("\\!")).mapToInt(Integer::parseInt).toArray();
            int sum = 0;
            //sum of the sequnce
            for (int i = 0; i < lengthOfDNA; i++) {
                sum += numbers[i];
            }
            int startIndex = 0;
            int count = 0;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == 1) {
                    count++;
                } else {
                    startIndex = i - count;
                    if (count == maxCount) {
                        if (startIndex == leftmostIndex) {
                            if (sum > maxSum) {
                                bestSequenceIndex = sequenceIndex;
                                maxSum = sum;
                            }
                        }
                    } else if (count > maxCount) {
                        maxCount = count;
                    }
                    count = 0;
                }
            }

            line = scanner.nextLine();
            sequenceIndex++;
        }
        System.out.printf("Best DNA sample %d with sum: %d.", bestSequenceIndex, maxSum);
    }
}

