package OblectsAndClasses.Exercise.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<VehicleCatalogue> vehicleCatalogues = new ArrayList<>();
        VehicleCatalogue vehicle = new VehicleCatalogue();
        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String type = line.split(" ")[0];
            String model = line.split(" ")[1];
            String color = line.split(" ")[2];
            int horsepower = Integer.parseInt(line.split(" ")[3]);

            VehicleCatalogue vh = new VehicleCatalogue(type, model, color, horsepower);
            vehicleCatalogues.add(vh);

            line = scanner.nextLine();
        }

        line = scanner.nextLine();
        while (!line.equals("Close the Catalogue")) {
            for (VehicleCatalogue vehicleCatalogue : vehicleCatalogues) {
                vehicleCatalogue.printByCategory(line);
            }

            line = scanner.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n",vehicle.getAverage("car"));
        System.out.printf("Trucks have average horsepower of: %.2f.",vehicle.getAverage("truck"));
    }
}
