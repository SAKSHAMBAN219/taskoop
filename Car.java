public class Car {
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private boolean isAvailable = true;
    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public double getRentalPricePerDay() { return rentalPricePerDay; }
    public void setRentalPricePerDay(double price) {
        if (price >= 0) this.rentalPricePerDay = price;
    }
    public boolean isAvailable() { return isAvailable; }
    public void rentCar() {
        if (isAvailable) isAvailable = false;
    }
    public void returnCar() {
        isAvailable = true;
    }
}
