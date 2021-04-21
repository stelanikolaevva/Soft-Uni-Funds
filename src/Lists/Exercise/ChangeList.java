package Lists.Exercise;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] token = line.split(" ");
            switch (token[0]) {
                case "Delete":
                    int elementToDelete = Integer.parseInt(token[1]);
                    for (int i = 0; i < integers.size(); i++) {
                        if(integers.get(i) == elementToDelete){
                            integers.remove(i);
                        }
                    }
                    break;
                case "Insert":
                    int elementToInsert = Integer.parseInt(token[1]);
                    int position = Integer.parseInt(token[2]);
                    integers.add(position, elementToInsert);
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.println(integers.toString().replaceAll("[\\[\\],]",""));
    }
}
