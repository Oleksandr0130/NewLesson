package lesson_13.HomeWork;

import lesson_13.MyDate;

public class Auto {
    String brand;
    String model;
    String numberPlate;
    String color;
    double price;
    MyDate1 registrationDate;

    public Auto(String brand, String model, String numberPlate, String color, double price, MyDate1 registrationDate) {
        this.brand = brand;
        this.model = model;
        this.numberPlate = numberPlate;
        this.color = color;
        this.price = price;
        this.registrationDate = registrationDate;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", numberPlate = '" + numberPlate + '\'' +
                ", color = '" + color + '\'' +
                ", price = " + price +
                ", registrationDate = " + registrationDate +
                '}';
    }
}
