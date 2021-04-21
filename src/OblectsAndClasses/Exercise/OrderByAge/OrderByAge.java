package OblectsAndClasses.Exercise.OrderByAge;

import java.util.*;

public class OrderByAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> people = new TreeMap<>();

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String name = line.split(" ")[0] + " with ID: " + line.split(" ")[1];
            int age = Integer.parseInt(line.split(" ")[2]);
            people.put(name, age);
            line = scanner.nextLine();
        }

        people.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(k -> System.out.print(k.getKey() + " is " + k.getValue() + " years old.\n"));

    }
}
