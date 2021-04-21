package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int successfulRegistrationCount =0;
        String regex = "(U\\$)(?<username>[A-Z][a-z][a-z]+)\\1(P\\@\\$)(?<password>[a-zA-Z]{5,}[0-9]+)\\3";
        Pattern pattern = Pattern.compile(regex);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfLines; i++) {
            String registration = scanner.nextLine();
            Matcher matcher = pattern.matcher(registration);

            if(matcher.find()){
                String username = matcher.group("username");
                String password = matcher.group("password");
                successfulRegistrationCount++;

                System.out.println("Registration was successful");
                System.out.printf("Username: %s, Password: %s%n",username,password);
            }else{
                System.out.println("Invalid username or password");
            }
        }
        System.out.println("Successful registrations: " + successfulRegistrationCount);
    }
}
