public class CarFinal {
    final int noOfWheels;
    final String model;
    int engineInLiters;

    public CarFinal(int noOfWheels, String model, int engineInLiters) {
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.engineInLiters = engineInLiters;
        this.engineInLiters++;
    }
}
