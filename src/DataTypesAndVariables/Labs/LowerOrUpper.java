package DataTypesAndVariables.Labs;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        char ch=scanner.nextLine().charAt(0);
        boolean isLower=(ch>=97 && ch<=122);

        if(isLower){
            System.out.println("lower-case");
        }else {
            System.out.println("upper-case");
        }
    }
}
