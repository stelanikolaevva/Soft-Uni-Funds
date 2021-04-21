package MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> users = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];
            if (!users.containsKey(companyName)) {
                users.put(companyName, new ArrayList<>());
            }
            if (!users.get(companyName).contains(employeeId)) {
                users.get(companyName).add(employeeId);
            }
            input = scanner.nextLine();
        }
        users.forEach((key, value) -> {System.out.println(key);value.forEach(id -> System.out.println("-- " + id));});
    }
}
