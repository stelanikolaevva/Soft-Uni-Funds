package Array.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

       while(rotations!=0){
           int buff=numbers[0];
           for (int i = 0; i < numbers.length-1; i++) {
               numbers[i]=numbers[i+1];
           }
           numbers[numbers.length-1]=buff;
           rotations--;
       }
        for (int number : numbers) {
            System.out.print(number+" ");

        }
    }
}
