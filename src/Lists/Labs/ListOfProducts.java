package Lists.Labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        List<String> listOfProducts = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String line = scanner.nextLine();
            listOfProducts.add(line);
        }
        Collections.sort(listOfProducts);
        for (int i = 0; i < count; i++) {
            System.out.printf("%d.%s%n", i + 1, listOfProducts.get(i));
        }
    }
}
