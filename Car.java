public class Car {
    private String bodyStyle;
    private String power;
    private String engine;
    private String brakes;
    private String seats;
    private String windows;
    private String fuelType;
    private String carType;

    // Private constructor for Builder
    private Car(CarBuilder builder) {
        this.carType = builder.carType;
        this.bodyStyle = builder.bodyStyle;
        this.power = builder.power;
        this.engine = builder.engine;
        this.brakes = builder.brakes;
        this.seats = builder.seats;
        this.windows = builder.windows;
        this.fuelType = builder.fuelType;
    }

    @Override
    public String toString() {
        return "-------------- " + carType + " ---------------------\n"
                + " Body: " + bodyStyle + "\n"
                + " Power: " + power + "\n"
                + " Engine: " + engine + "\n"
                + " Brakes: " + brakes + "\n"
                + " Seats: " + seats + "\n"
                + " Windows: " + windows + "\n"
                + " Fuel Type: " + fuelType;
    }

    // Builder Class
    public static class CarBuilder {
        private String bodyStyle;
        private String power;
        private String engine;
        private String brakes;
        private String seats;
        private String windows;
        private String fuelType;
        private String carType;

        public CarBuilder(String carType) {
            this.carType = carType;
        }

        public CarBuilder setBodyStyle(String bodyStyle) {
            this.bodyStyle = bodyStyle;
            return this;
        }

        public CarBuilder setPower(String power) {
            this.power = power;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setBrakes(String brakes) {
            this.brakes = brakes;
            return this;
        }

        public CarBuilder setSeats(String seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setWindows(String windows) {
            this.windows = windows;
            return this;
        }

        public CarBuilder setFuelType(String fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
