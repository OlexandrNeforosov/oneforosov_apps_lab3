package ua.odu.op.oneforosov;

public class Vehicle {
    private String model;
    private int year;
    private double milage;

    // Поточний статус тех. обслуговування
    boolean status;

    public Vehicle(String model, int year, double milage, boolean status) {
        this.model = model;
        this.year = year;
        this.milage = milage;
        this.status = status;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMilage() {
        return milage;
    }

    public void setMilage(double milage) {
        this.milage = milage;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setModel(String value) {
        model = value;
    }

    public String serviceVehicle() {
        if(status) {
            return "Тех. обслуговування пройдено";
        } else {
            return "Тех. обслуговування НЕ пройдено";
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", milage=" + milage +
                ", status=" + status +
                '}';
    }
}
