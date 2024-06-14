package ua.odu.op.oneforosov;

public class Main {
    public static void main(String[] arguments) {
        Vehicle[] array = new Vehicle[5];
        array[0] = new Vehicle("Nissan", 1999, 60000.250, false);
        array[1] = new Vehicle("Subaru", 2020, 10000.80, true);
        array[2] = new Vehicle("Toyota", 1995, 120000.520, false);
        array[3] = new Vehicle("Mitsubishi", 2004, 220000.67, true);
        array[4] = new Vehicle("Mazda", 2006, 89000.123, true);

        for(int counter = 0; counter < 5; counter++) {
            System.out.println(array[counter].getModel() + "; " + array[counter].getYear() + "; " + array[counter].getMilage());
            System.out.println(array[counter].toString());
            System.out.println(array[counter].serviceVehicle());

        }
    }
}
