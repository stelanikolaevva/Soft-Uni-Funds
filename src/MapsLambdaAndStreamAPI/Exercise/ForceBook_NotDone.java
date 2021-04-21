package MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class ForceBook_NotDone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> force = new TreeMap<>();
        String line = scanner.nextLine();
        while (!line.equals("Lumpawaroo")) {
            if (line.contains("->")) {
                String user = line.split(" \\-> ")[0];
                String side = line.split(" \\-> ")[1];

                if (force.containsKey(side)) {
                    boolean exists = false;
                    for (Map.Entry<String, List<String>> entry : force.entrySet()) {
                        if (entry.getValue().contains(user)) {
                            exists = true;
                            break;
                        }
                    }
                    if(exists){

                    }else{

                    }
                }else{
                    System.out.println("a");
                }

                System.out.printf("%s joins the %s side!%n", user, side);

            } else if (line.contains("|")) {
                String user = line.split(" \\| ")[1];
                String side = line.split(" \\| ")[0];
                boolean exists = false;
                for (Map.Entry<String, List<String>> entry : force.entrySet()) {
                    if (entry.getValue().contains(user)) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    if (!force.containsKey(side)) {
                        force.put(side, new ArrayList<>());
                    }
                    force.get(side).add(user);
                }
            }

            line = scanner.nextLine();
        }
        force.entrySet()
                .stream()
                .filter(n1 -> n1.getValue().size() > 0)
                .sorted((x, y) -> Integer.compare(y.getValue().size(), x.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream()
                            .sorted(String::compareTo)
                            .forEach(e -> System.out.printf("! %s%n", e));
                });
    }
}
