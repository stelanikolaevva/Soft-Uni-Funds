package MidExam;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double experienceNeededForUnlock = Double.parseDouble(scanner.nextLine());
        int battlesCount = Integer.parseInt(scanner.nextLine());

        double experienceCollected = 0.0;
        boolean isCollected = false;
        for (int i = 1; i <= battlesCount; i++) {

            float experienceGained = Float.parseFloat(scanner.nextLine());
            if (i % 3 == 0) {
                experienceGained *= 1.15;
            }
            if (i % 5 == 0) {
                experienceGained *= 0.90;
            }
            if (i % 15 == 0) {
                experienceGained *= 1.05;
            }
            experienceCollected += experienceGained;
            if (experienceCollected >= experienceNeededForUnlock) {
                isCollected = true;
                System.out.printf("Player successfully collected his needed experience for %d battles.", i);
                break;
            }
        }
        if (!isCollected) {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", experienceNeededForUnlock - experienceCollected);
        }
    }
}
