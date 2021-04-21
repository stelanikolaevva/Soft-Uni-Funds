package OblectsAndClasses.Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> person = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] pp = scanner.nextLine().split("\\s+");
            person.put(pp[0], Integer.parseInt(pp[1]));
        }

        person.entrySet().stream().filter(value -> value.getValue() > 30).forEach(k -> System.out.println(k.getKey() + " - " + k.getValue()));

    }
}
