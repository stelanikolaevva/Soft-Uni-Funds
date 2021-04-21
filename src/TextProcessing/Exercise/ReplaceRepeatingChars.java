package TextProcessing.Exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        char last = input.charAt(0);
        int count = 0;
        for (int i = 1; i < input.length(); i++) {
            if(input.charAt(i)==last){
                count ++;
            }else{
                input = input.replace(i-count,i,"");
                i-= count;
                count = 0;
            }
            last = input.charAt(i);
        }
        if(input.charAt(input.length()-2)==last){
            input.delete(input.length()-count-1,input.length()-1);
        }
        System.out.println(input);
    }
}
