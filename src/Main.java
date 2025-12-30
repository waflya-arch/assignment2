public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Ertay Arman", "122324");
        Driver driver2 = new Driver("Ermek Janiber", "120312");

        Car myCar = new Car("Toyota Camry", 2022, 4, "Gasoline");
        Motorcycle myBike = new Motorcycle("Harley Davidson", 2021, false);
        Truck myTruck = new Truck("Volvo FH16", 2023, 25.5, 3);

        myCar.setDriver(driver1);
        myBike.setDriver(driver2);
        myTruck.setDriver(driver1);

        Vehicle[] fleet = {myCar, myBike, myTruck};

        System.out.println("Vehicle Management System Status\n");
        for (Vehicle v : fleet) {
            v.displayInfo();
            v.startEngine();
            v.stopEngine();
        }
    }
}
