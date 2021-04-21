package FinalExam;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> messageStatistic = new TreeMap<>();

        String line = scanner.nextLine();
        while (!line.equals("Statistics")) {
            String[] commands = line.split("\\=");
            String command = commands[0];

            switch (command) {
                case "Add":
                    String username = commands[1];
                    int sentMessages = Integer.parseInt(commands[2]);
                    int receivedMessages = Integer.parseInt(commands[3]);

                    if (!messageStatistic.containsKey(username)) {
                        messageStatistic.put(username, new ArrayList<>());
                        messageStatistic.get(username).add(sentMessages);
                        messageStatistic.get(username).add(receivedMessages);
                    }
                    break;

                case "Message":
                    String sender = commands[1];
                    String receiver = commands[2];

                    if (messageStatistic.containsKey(sender) && messageStatistic.containsKey(receiver)) {
                        addMessage(messageStatistic, sender, 0);//0-sent 1-received
                        addMessage(messageStatistic, receiver, 1);//0-sent 1-received

                        if (checkOverCapacity(capacity, messageStatistic, sender)) {
                            messageStatistic.remove(sender);
                            System.out.printf("%s reached the capacity!%n", sender);
                        }
                        if (checkOverCapacity(capacity, messageStatistic, receiver)) {
                            messageStatistic.remove(receiver);
                            System.out.printf("%s reached the capacity!%n", receiver);
                        }
                    }
                    break;

                case "Empty":
                    String usernameOrAll = commands[1];
                    if (usernameOrAll.equals("All")) {
                        messageStatistic.clear();
                    } else {
                        messageStatistic.remove(usernameOrAll);
                    }
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.println("Users count: " + messageStatistic.size());
        messageStatistic.entrySet().
                stream()
                .sorted((r1, r2) -> r2.getValue().get(1).compareTo(r1.getValue().get(1)))
                .forEach(k -> System.out.println(k.getKey() + " - " + (k.getValue().get(1) + k.getValue().get(0))));
    }

    private static void addMessage(Map<String, List<Integer>> messageStatistic, String person, int index) {
        int add = messageStatistic.get(person).get(index);
        add++;
        messageStatistic.get(person).remove(index);
        messageStatistic.get(person).add(index, add);

    }

    private static boolean checkOverCapacity(int capacity, Map<String, List<Integer>> messageStatistic, String person) {
        int sent = messageStatistic.get(person).get(0);
        int received = messageStatistic.get(person).get(1);
        int total = sent + received;

        return total >= capacity;
    }
}
