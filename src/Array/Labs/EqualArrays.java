package Array.Labs;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbersOfFirstLine = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbersOfSecondLine = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;

        int biggerOne = Math.max(numbersOfFirstLine.length, numbersOfSecondLine.length);

        for (int i = 0; i < biggerOne; i++) {
            sum += numbersOfFirstLine[i];
            if (numbersOfFirstLine[i] != numbersOfSecondLine[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);


    }
}
