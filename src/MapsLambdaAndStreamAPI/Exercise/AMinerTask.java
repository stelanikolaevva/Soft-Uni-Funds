package MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();
        int line = 1;
        String resource = "";
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            if (line % 2 != 0) {
                if (!resources.containsKey(input)) {
                    resources.put(input,0);
                }
            } else {
                int quantity = Integer.parseInt(input);
                resources.put(resource,resources.get(resource)+quantity);
            }
            resource = input;
            input = scanner.nextLine();
            line++;
        }

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
