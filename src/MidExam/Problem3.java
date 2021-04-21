package MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> magicCards = Arrays.stream(scanner.nextLine().split(":")).collect(Collectors.toList());
        List<String> ourDeck = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("Ready")) {
            String command = line.split(" ")[0];
            String cardName = line.split(" ")[1];

            switch (command) {
                case "Add":
                    if (magicCards.contains(cardName)) {
                        ourDeck.add(cardName);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;

                case "Insert":
                    int index = Integer.parseInt(line.split(" ")[2]);
                    if (magicCards.contains(cardName) && (index >= 0 && index < ourDeck.size())) {
                        ourDeck.add(index, cardName);
                    } else {
                        System.out.println("Error!");
                    }
                    break;

                case "Remove":
                    if(ourDeck.contains(cardName) && magicCards.contains(cardName)){
                        ourDeck.remove(cardName);
                    }else{
                        System.out.println("Card not found.");
                    }
                    break;

                case "Swap":
                    String cardNameToSwap = line.split(" ")[2];
                    int indexOfFirst = ourDeck.indexOf(cardName);
                    int indexOfSecond = ourDeck.indexOf(cardNameToSwap);

                    ourDeck.set(indexOfFirst,cardNameToSwap);
                    ourDeck.set(indexOfSecond,cardName);
                    break;

                case "Shuffle":
                    Collections.reverse(ourDeck);
                    break;
            }

            line = scanner.nextLine();
        }
        System.out.println(ourDeck.toString().replaceAll("[\\[\\],]",""));
    }
}
