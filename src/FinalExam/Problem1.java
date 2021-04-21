package FinalExam;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // StringBuilder input = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        String line = scanner.nextLine().trim();
        while (!line.equals("Finish")) {
            String[] commands = line.split("\\s+");
            String command = commands[0];
            switch (command) {
                case "Replace":
                    char currentChar = commands[1].charAt(0);
                   // char replacementChar = commands[2].charAt(0);

                    input = input.replace(currentChar, '-');
                    System.out.println(input);
                    break;
                case "Cut":
                    int startIndexToCut = Integer.parseInt(commands[1]);
                    int endIndexToCut = Integer.parseInt(commands[2]);

                    Cut(startIndexToCut,endIndexToCut,input);
                    break;
                case "Make":
                    String upLow = commands[1];
                    if (upLow.equals("Upper")) {
                        input = input.toUpperCase();
                    } else if (upLow.equals("Lower")) {
                        input = input.toLowerCase();
                    }
                    System.out.println(input);
                    break;
                case "Check":
                    String match = commands[1];

                    Check(match, input);
                    break;
                case "Sum":
                    int startIndex = Integer.parseInt(commands[1]);
                    int endIndex = Integer.parseInt(commands[2]);

                    Sum(startIndex,endIndex,input);
                    break;
            }

            line = scanner.nextLine();
        }
    }
    public static void Cut(int startIndex, int endIndex, String input){
        if (isValid(startIndex, endIndex, input)) {
            StringBuilder sb = new StringBuilder(input);

            sb.delete(startIndex, endIndex + 1);
            input = sb.toString();

            System.out.println(input);
        } else {
            System.out.println("Invalid indices!");
        }
    }
    public static void Check(String match, String input){
        int index = input.indexOf(match);
        if (index == -1) {
            System.out.println("Message doesn't contain " + match);
        } else {
            System.out.println("Message contains " + match);
        }
    }
    public static void Sum(int startIndex, int endIndex, String input){
        if (isValid(startIndex, endIndex, input)) {
            String substring = input.substring(startIndex,endIndex+1);
            int sum = 0;
            for (int i = 0; i < substring.length(); i++) {
                char currentSymbol = substring.charAt(i);
                sum+=currentSymbol;
            }
            System.out.println(sum);
        } else {
            System.out.println("Invalid indices!");
        }
    }
    public static boolean isValid(int start, int end, String str) {
        return (start >= 0 && start < str.length() - 1) && (end > 0 && end <= str.length() - 1) ;
    }

}
