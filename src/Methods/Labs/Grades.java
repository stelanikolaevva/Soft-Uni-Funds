package Methods.Labs;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());
        gradeInWords(grade);
    }

    private static void gradeInWords(double grade) {
        if (grade <= 6.00 && grade >= 5.50) {
            System.out.println("Excellent");
        } else if (grade < 5.50 && grade >= 4.50) {
            System.out.println("Very good");
        } else if (grade < 4.50 && grade >= 3.50) {
            System.out.println("Good");
        } else if (grade < 3.50 && grade >= 3.00) {
            System.out.println("Poor");
        } else if (grade < 3.00 && grade >= 2.00) {
            System.out.println("Fail");
        }
    }
}
