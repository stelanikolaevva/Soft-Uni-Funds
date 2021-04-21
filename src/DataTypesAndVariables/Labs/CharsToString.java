package DataTypesAndVariables.Labs;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        char firstLine=scanner.nextLine().charAt(0);
        char secondLine=scanner.nextLine().charAt(0);
        char thirdLine=scanner.nextLine().charAt(0);
        String combined=String.format("%c%c%c",firstLine,secondLine,thirdLine);
        System.out.println(combined);
    }
}
