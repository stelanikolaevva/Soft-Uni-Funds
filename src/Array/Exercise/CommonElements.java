package Array.Exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String s : secondArray) {
            for (String s1 : firstArray) {
                if (s.equals(s1)) {
                    System.out.print(s + " ");
                    break;
                }
            }
        }
    }
}
