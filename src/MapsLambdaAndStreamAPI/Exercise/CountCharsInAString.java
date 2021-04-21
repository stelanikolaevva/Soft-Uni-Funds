package MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> count = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            if (currentSymbol != ' ') {
                if (!count.containsKey(currentSymbol)) {
                    count.put(text.charAt(i), 0);
                }
                count.put(currentSymbol, count.get(currentSymbol) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
