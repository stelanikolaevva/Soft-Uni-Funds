package Methods.Labs;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(a, b));
                break;
            case "char":
                char k = scanner.nextLine().charAt(0);
                char m = scanner.nextLine().charAt(0);
                System.out.println(getMax(k, m));
                break;
            case "string":
                String first = scanner.nextLine();
                String second = scanner.nextLine();
                System.out.println(getMax(first, second));
                break;
        }
    }

    private static int getMax(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    private static char getMax(char a, char b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    private static String getMax(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        }
        return b;
    }
}
