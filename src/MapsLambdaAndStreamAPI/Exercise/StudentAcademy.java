package MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> studentGrades = new LinkedHashMap<>();

        int numberLines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberLines; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if(!studentGrades.containsKey(name)){
                studentGrades.put(name,grade);
            }
            studentGrades.put(name,(studentGrades.get(name)+grade)/2);

        }
        studentGrades.entrySet().stream().filter(e-> e.getValue()>=4.50)
                .sorted((e1,e2)->e2.getValue().compareTo(e1.getValue()))
                .forEach(en->System.out.printf("%s -> %.2f%n", en.getKey(), en.getValue()));
    }
}
