package Array.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            boolean isBigger = true;
            for (int k = i+1; k < numbers.length; k++) {
                if (numbers[i] <= numbers[k]) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(numbers[i]+ " ");
            }

        }
    }
}
