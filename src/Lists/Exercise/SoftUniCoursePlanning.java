package Lists.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!line.equals("course start")) {
            String[] commands = line.split(":");

            String lessonTitle = commands[1];
            String exercise = String.format("%s-exercise", lessonTitle);

            switch (commands[0]) {
                case "Add":
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                    break;

                case "Insert":
                    int index = Integer.parseInt(commands[2]);
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(index, lessonTitle);
                    }
                    break;

                case "Remove":
                    schedule.remove(lessonTitle);
                    schedule.remove(exercise);
                    break;

                case "Swap":
                    String secondLessonTitle = commands[2];
                    if (schedule.contains(lessonTitle) && schedule.contains(secondLessonTitle)) {
                        int indexOfFirst = schedule.indexOf(lessonTitle);
                        int indexOfSecond = schedule.indexOf(secondLessonTitle);
                        Collections.swap(schedule, indexOfFirst, indexOfSecond);
                    }
                    if (schedule.contains(exercise) && !schedule.contains(String.format("%s-exercise", secondLessonTitle))) {
                        int indexOfFirst = schedule.indexOf(exercise);
                        int indexOfSecond = schedule.indexOf(lessonTitle);
                        Collections.swap(schedule, indexOfFirst, indexOfSecond);
                        schedule.add(indexOfSecond+1,exercise);
                        schedule.remove(indexOfFirst+1);
                    }

                    break;

                case "Exercise":
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                        schedule.add(exercise);
                    } else {
                        int indexOfLesson = schedule.indexOf(lessonTitle);
                        schedule.add(indexOfLesson + 1, exercise);
                    }
                    break;
            }

            line = scanner.nextLine();
        }
        for (
                int i = 0; i < schedule.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, schedule.get(i));
        }
    }
}
