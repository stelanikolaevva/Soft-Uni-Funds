package Methods.Exercise;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        int vowels = getVowels(line);
        System.out.println(vowels);
    }

    private static int getVowels(String line) {
        int count = 0;
        line = line.toLowerCase(Locale.ROOT);
        for (int i = 0; i < line.length(); i++) {
            if (isVowel(line.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    private static boolean isVowel(char k) {
        if (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u') {
            return true;
        }
        return false;
    }
}
