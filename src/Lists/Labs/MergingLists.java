package Lists.Labs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int minLength = Math.min(firstList.size(), secondList.size());
        boolean isBigger = firstList.size() > secondList.size();
        List<Integer> finalList = new ArrayList<>();
        for (int i = 0; i < minLength; i++) {
            finalList.add(firstList.get(i));
            finalList.add(secondList.get(i));
        }
        if (isBigger) {
            insert(minLength, firstList, finalList);
        } else {
            insert(minLength, secondList, finalList);
        }

        System.out.println(finalList.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void insert(int minLength, List<Integer> list, List<Integer> finalList) {
        for (int i = minLength; i < list.size(); i++) {
            finalList.add( list.get(i));
        }
    }

}
