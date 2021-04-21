package TextProcessing.Exercise;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        BigInteger bigInteger = new BigInteger(String.valueOf(scanner.nextLine()));
//        int digit = Integer.parseInt(scanner.nextLine());
//        System.out.println(bigInteger.multiply(BigInteger.valueOf(digit)));

        String number = scanner.nextLine();
        int digit = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int current=Integer.parseInt(String.valueOf(number.charAt(i)));
            int add = current* digit;
            sb.append(add % 10 + carry);
            if (add >= 10) {
                carry = add / 10;
            }
            else{
                carry = 0;
            }
        }
        if(carry!=0){
            sb.append(carry);
        }
        sb.reverse();
        System.out.println(sb);
    }
}
