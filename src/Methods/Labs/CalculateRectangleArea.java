package Methods.Labs;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        System.out.println(getArea(width, length));
    }

    private static int getArea(int width, int length) {
        return width * length;
    }
}
