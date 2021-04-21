package OblectsAndClasses.Exercise.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            String firstName = line[0];
            String lastName = line[1];
            double grade = Double.parseDouble(line[2]);

            Student st = new Student(firstName,lastName,grade);
            students.add(st);
        }
        students.sort((o1, o2) -> Double.compare(o2.getGrade(), o1.getGrade()));
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
