package Methods.Labs;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());

        printTopHalf(number);
        printBottomHalf(number);
    }

    public static void printTopHalf(int number){
        for (int i = 1; i <=number ; i++) {
            printSingleLine(i);
            System.out.println();
        }

    }

    private static void printSingleLine(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j+" ");
        }
    }

    public static void printBottomHalf(int number){
        for (int i = number - 1; i >=1 ; i--) {
            printSingleLine(i);
            System.out.println();
        }
    }
}
