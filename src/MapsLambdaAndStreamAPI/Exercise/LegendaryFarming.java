package MapsLambdaAndStreamAPI.Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String material = "";
        Map<String, Integer> crafts = new TreeMap<>();
        crafts.put("shards", 0);
        crafts.put("fragments", 0);
        crafts.put("motes", 0);


        Map<String, Integer> junkMaterial = new TreeMap<>();
        boolean isCollected = false;
        while (!isCollected) {
            String[] input = scanner.nextLine().split(" ");
            for (int i = 1; i < input.length; i += 2) {
                int quantity = Integer.parseInt(input[i - 1]);
                material = input[i].toLowerCase();

                if (!material.equals("shards") && !material.equals("fragments") && !material.equals("motes")) {
                    putInMap(junkMaterial, material, quantity);
                } else {
                    int newQuantity = crafts.get(material)+quantity;
                    crafts.put(material,newQuantity);
                    if (newQuantity >= 250) {
                        crafts.put(material, crafts.get(material) - 250);
                        isCollected = true;
                        break;
                    }
                }
            }
        }
        String item = "";
        switch (material) {
            case "shards":
                item = "Shadowmourne";
                break;
            case "fragments":
                item = "Valanyr";
                break;
            case "motes":
                item = "Dragonwrath";
                break;
        }

        System.out.printf("%s obtained!%n", item);

        crafts.entrySet()
                .stream()
                .sorted((entry1, entry2) -> {
                    int res = entry2.getValue().compareTo(entry1.getValue());
                    if (res == 0) {
                        res = entry1.getKey().compareTo(entry2.getKey());
                    }
                    return res;
                })
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        printMap(junkMaterial);
    }

    public static void putInMap(Map<String, Integer> crafts, String material, int quantity) {
        if (!crafts.containsKey(material)) {
            crafts.put(material, quantity);
        } else {
            int newQuantity = crafts.get(material) + quantity;
            crafts.put(material, newQuantity);
        }
    }

    static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
