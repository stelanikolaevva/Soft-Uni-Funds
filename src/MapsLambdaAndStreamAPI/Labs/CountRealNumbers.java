package MapsLambdaAndStreamAPI.Labs;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double,Integer> counts = new TreeMap<>();
        for (double number : numbers) {
            if (!counts.containsKey(number)) {
                counts.put(number, 0);
            }
            counts.put(number, counts.get(number) + 1);
        }

        for (Map.Entry<Double, Integer> doubleIntegerEntry : counts.entrySet()) {
            DecimalFormat decimalFormat = new DecimalFormat("#.#####");
            System.out.printf("%s -> %d%n",decimalFormat.format(doubleIntegerEntry.getKey()),doubleIntegerEntry.getValue());
        }
    }
}
