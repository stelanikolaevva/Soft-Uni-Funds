package MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        Map<String,String> parkingLot = new LinkedHashMap<>();
        for (int i = 0; i < numberOfCommands; i++) {
            String[] input = scanner.nextLine().split(" ");
            String username = input[1];

            switch (input[0]){
                case "register":
                    String licensePlateNumber = input[2];
                    if(parkingLot.containsKey(username)){
                        System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                    }else{
                        parkingLot.put(username,licensePlateNumber);
                        System.out.printf("%s registered %s successfully%n",username,licensePlateNumber);
                    }
                    break;
                case "unregister":
                    if(!parkingLot.containsKey(username)){
                        System.out.printf("ERROR: user %s not found%n",username);
                    }else{
                        parkingLot.remove(username);
                        System.out.printf("%s unregistered successfully%n",username);
                    }
                    break;
            }
        }
        parkingLot.forEach((k, v)-> {
            System.out.println(k + " => " + v);
        });
    }
}
