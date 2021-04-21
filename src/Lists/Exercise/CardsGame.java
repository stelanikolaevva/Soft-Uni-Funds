package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.Math.min;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int minCards = min(firstPlayer.size(), secondPlayer.size());

        for (int i = 0; i < minCards; i++) {
            int firstPersonCard = firstPlayer.get(i);
            int secondPersonCard = secondPlayer.get(i);
            if (firstPersonCard > secondPersonCard) {
                firstPlayer.remove(i);
                secondPlayer.remove(i);
                firstPlayer.add(firstPersonCard);
                firstPlayer.add(secondPersonCard);
            } else if (firstPersonCard < secondPersonCard) {
                firstPlayer.remove(i);
                secondPlayer.remove(i);
                secondPlayer.add(secondPersonCard);
                secondPlayer.add(firstPersonCard);
            } else {
                firstPlayer.remove(i);
                secondPlayer.remove(i);
            }
            minCards = min(firstPlayer.size(), secondPlayer.size());

            if (minCards == 0) break;
            i = -1;
        }
        if (secondPlayer.size() == 0) {
            System.out.print("First player wins! Sum: ");
            printSum(firstPlayer);
        } else {
            System.out.print("Second player wins! Sum: ");
            printSum(secondPlayer);
        }
    }

    public static void printSum(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(sum);
    }
}
