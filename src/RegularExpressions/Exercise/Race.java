package RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regexName = "[A-Za-z]+";
        Pattern patternName = Pattern.compile(regexName);

        String regexDistance = "[0-9]";
        Pattern patternDistance = Pattern.compile(regexDistance);

        List<String> participants = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        Map<String, Integer> participantsDistances = new LinkedHashMap<>();
        participants.forEach(participant -> participantsDistances.put(participant, 0));

        String line = scanner.nextLine();
        while (!line.equals("end of race")) {

            Matcher matcherName = patternName.matcher(line);
            StringBuilder sb = new StringBuilder();
            while (matcherName.find()) {
                sb.append(matcherName.group());
            }
            String name = sb.toString();

            int distance = 0;
            Matcher matcherDistance = patternDistance.matcher(line);
            while (matcherDistance.find()) {
                distance += Integer.parseInt(matcherDistance.group());
            }

            if (participantsDistances.containsKey(name)) {
                participantsDistances.put(name, participantsDistances.get(name) + distance);
            }

            line = scanner.nextLine();
        }

        List<String> firstThree = participantsDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("1st place: " + firstThree.get(0));
        System.out.println("2nd place: " + firstThree.get(1));
        System.out.println("3rd place: " + firstThree.get(2));
    }
}
