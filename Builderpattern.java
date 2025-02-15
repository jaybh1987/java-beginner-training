public class Builderpattern {
    public static void main(String[] args) {
        // Creating a Car object using the Builder Pattern
        Car sportsCar = new Car.CarBuilder("Sports Car")
                .setBodyStyle("Coupe")
                .setPower("450 HP")
                .setEngine("V8 Turbo")
                .setBrakes("Disc Brakes")
                .setSeats("2")
                .setWindows("Power Windows")
                .setFuelType("Petrol")
                .build();

        Car suv = new Car.CarBuilder("SUV")
                .setBodyStyle("SUV")
                .setPower("250 HP")
                .setEngine("V6 Engine")
                .setBrakes("ABS Brakes")
                .setSeats("7")
                .setWindows("Tinted Windows")
                .setFuelType("Diesel")
                .build();

        // Print the cars
        System.out.println(sportsCar);
        System.out.println("\n" + suv);
    }
}
