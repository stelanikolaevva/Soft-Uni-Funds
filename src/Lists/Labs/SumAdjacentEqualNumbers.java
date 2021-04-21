package Lists.Labs;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Double> items = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < items.size() - 1; i++) {
            if (items.get(i).equals(items.get(i + 1))) {
                double number = items.get(i) + items.get(i + 1);
                items.set(i, number);
                items.remove(i+1);
                i = -1;
            }
        }
        for (Double number : items) {
            DecimalFormat decimalFormat=new DecimalFormat("0.#");
            System.out.print(decimalFormat.format(number)+" ");


        }

    }
}
