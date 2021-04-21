package Array.Exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int[] wagons=new int[n];
        int people=0;
        for(int i=0;i<n;i++){
            wagons[i]=Integer.parseInt(scanner.nextLine());
            people+=wagons[i];
        }
        for (int wagon : wagons) {
            System.out.print(wagon+" ");
        }
        System.out.println();
        System.out.println(people);
    }
}
