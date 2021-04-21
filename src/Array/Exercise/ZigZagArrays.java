package Array.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        boolean isLeft = true;
        for (int i = 0; i < n; i++) {
            int[] line = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (isLeft) {
                firstArray[i] = line[0];
                secondArray[i] = line[1];
                isLeft = false;
            } else {
                firstArray[i] = line[1];
                secondArray[i] = line[0];
                isLeft = true;
            }
        }
        for (int i : firstArray) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : secondArray) {
            System.out.print(i+" ");
        }
    }
}
