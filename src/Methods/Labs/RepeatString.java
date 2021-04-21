package Methods.Labs;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());

        String output = repeatString(line, repeatCount);
        System.out.println(output);
    }

    private static String repeatString(String line, int repeatCount) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            result.append(line);
        }
        return result.toString();
    }
}
