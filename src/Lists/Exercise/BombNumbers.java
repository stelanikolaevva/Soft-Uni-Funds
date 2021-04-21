package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] bomb = scanner.nextLine().split("\\s+");
        int bombNumber = Integer.parseInt(bomb[0]);
        int bombPower = Integer.parseInt(bomb[1]);

        while (numbers.contains(bombNumber)){
            int index=numbers.indexOf(bombNumber);
            int left=Math.max(0,index-bombPower);
            int right=Math.min(numbers.size()-1,index+bombPower);
            for (int j = right; j >=left ; j--) {
                numbers.remove(j);
            }

        }
        getSum(numbers);
    }


    private static void getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

}


