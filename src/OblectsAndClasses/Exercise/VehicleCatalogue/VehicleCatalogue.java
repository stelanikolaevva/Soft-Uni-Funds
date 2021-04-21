package OblectsAndClasses.Exercise.VehicleCatalogue;

public class VehicleCatalogue {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    private static int totalTruck = 0;
    private static int totalCar = 0;
    private static int countTruck=0;
    private static int countCar=0;

    public VehicleCatalogue(){}
    public VehicleCatalogue(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
        if(type.equals("truck")){
            this.type="Truck";
            countTruck++;
            totalTruck+=horsepower;
        }else if(type.equals("car")){
            this.type = "Car";
            countCar++;
            totalCar+=horsepower;
        }
    }
    public double getAverage (String type){
        double avg;
        if(type.equals("truck")){
            if(countTruck==0) return 0.0;
            avg = 1.0 * totalTruck / countTruck;

        }else {
            if(countCar==0) return 0.0;
            avg = 1.0 * totalCar / countCar;
        }
        return avg;


    }
    public void printByCategory(String model){
        if(this.model .equals(model)){
            System.out.println(this.toString());
        }
    }
    @Override
    public String toString() {
        return  String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",type,model,color,horsepower);
    }
}
