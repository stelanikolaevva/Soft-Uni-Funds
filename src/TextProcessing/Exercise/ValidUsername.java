package TextProcessing.Exercise;

import java.util.Scanner;

public class ValidUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");
        for (String username : usernames){
            if(isValidUsername(username)){
                System.out.println(username);
            }
        }
    }

    public static boolean isValidUsername(String username){
        if(username.length()<3 || username.length()>16){
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char currentSymbol = username.charAt(i);
            if(!Character.isLetterOrDigit(currentSymbol) && !(currentSymbol == '_') && !(currentSymbol == '-')){
                return false;
            }
        }
        return true;
    }
}
