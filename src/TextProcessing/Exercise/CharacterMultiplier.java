package TextProcessing.Exercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String firstString = line.split(" ")[0];
        String secondString = line.split(" ")[1];

        System.out.println(multiplyString(firstString,secondString));
    }

    private static int multiplyString(String firstString, String secondString) {
        int minSize = Math.min(firstString.length(),secondString.length());

        int sum = 0;
        for (int i = 0; i < minSize; i++) {
            sum+=firstString.charAt(i)*secondString.charAt(i);
        }
        boolean isBigger = firstString.length() > secondString.length();
        if(isBigger){
            sum+=restSum(firstString,minSize);
        }else{
            sum+=restSum(secondString,minSize);
        }

        return sum;
    }

    private static int restSum(String str, int startSize){
        int sum = 0;
        for (int i = startSize; i < str.length(); i++) {
            sum+=str.charAt(i);

        }
        return sum;
    }
}
