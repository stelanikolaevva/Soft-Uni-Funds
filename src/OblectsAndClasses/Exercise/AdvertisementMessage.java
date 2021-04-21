package OblectsAndClasses.Exercise;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        for (int i = 0; i < n; i++) {
            Random random = new Random();
            int randPhrase = random.nextInt(6);
            int randEvent = random.nextInt(6);
            int randAuthor = random.nextInt(8);
            int randCity = random.nextInt(5);

            System.out.printf("%s %s %s - %s%n",phrases[randPhrase],events[randEvent],authors[randAuthor],cities[randCity]);
        }

    }
}
