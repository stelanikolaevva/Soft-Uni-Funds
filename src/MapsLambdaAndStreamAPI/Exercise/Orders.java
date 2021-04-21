package MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> productsQuantity = new LinkedHashMap<>();
        Map<String, Double> priceList = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String product = input.split(" ")[0];
            double pricePerProduct = Double.parseDouble(input.split(" ")[1]);
            int quantityOfProduct = Integer.parseInt(input.split(" ")[2]);

            priceList.put(product, pricePerProduct);

            if (!productsQuantity.containsKey(product)) {
                productsQuantity.put(product, quantityOfProduct);
            } else {
                productsQuantity.put(product, productsQuantity.get(product) + quantityOfProduct);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : priceList.entrySet()) {
            System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()*(productsQuantity.get(entry.getKey())));
        }
    }
}
