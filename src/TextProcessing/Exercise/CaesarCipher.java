package TextProcessing.Exercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // each character shift 3 forward
        // a -> d

        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            currentSymbol += 3;
            System.out.print(currentSymbol);
        }
    }
}
