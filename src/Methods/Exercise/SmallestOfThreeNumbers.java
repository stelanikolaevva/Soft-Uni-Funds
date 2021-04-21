package Methods.Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        getSmallest(a, b, c);
    }

    private static void getSmallest(int a, int b, int c) {
        a = Math.min(a, b);
        a = Math.min(a, c);
        System.out.println(a);
    }
}