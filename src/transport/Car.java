package transport;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    public String color;
    public double engineVolume;
    public String gears;
    public String regNumber;
    public boolean summerTyres;

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        if (brand == null) {
            this.brand = "Default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "Default";
        } else {
            this.model = model;
        }
        if (year == 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null) {
            this.country = "Default";
        } else {
            this.country = country;
        }
        if (color == null) {
            this.color= "белый";
        } else {
            this.color = color;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public String getCountry() {
        return this.country;
    }

    public String getColor() {
        return this.color;
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    @Override
    public String toString() {
        return getBrand()+ " " + getModel() + ", "+ getYear() + " год выпуска, сборка в " + getCountry() +
                ", " + getColor() + ", объём двигателя - " + getEngineVolume() + " л.";
    }


}
