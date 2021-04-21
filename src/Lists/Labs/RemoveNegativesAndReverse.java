package Lists.Labs;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        integers.removeIf(n -> n < 0);
        if (integers.size() == 0) {
            System.out.println("empty");
        } else {
            Collections.reverse(integers);
            System.out.println(integers.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
