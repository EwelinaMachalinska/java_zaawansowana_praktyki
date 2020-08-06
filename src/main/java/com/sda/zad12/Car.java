package com.sda.zad12;

import java.util.Objects;

public class Car {

    private String name;
    private String type;
    private double price;
    private int yearOfProduction;
    private String Manufacturer;
    private String EngineType;


    public Car(String name, String type, double price, int yearOfProduction, String manufacturer, String engineType) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        Manufacturer = manufacturer;
        EngineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getEngineType() {
        return EngineType;
    }

    public void setEngineType(String engineType) {
        EngineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                yearOfProduction == car.yearOfProduction &&
                Objects.equals(name, car.name) &&
                Objects.equals(type, car.type) &&
                Objects.equals(Manufacturer, car.Manufacturer) &&
                Objects.equals(EngineType, car.EngineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, price, yearOfProduction, Manufacturer, EngineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", yearOfProduction=" + yearOfProduction +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", EngineType='" + EngineType + '\'' +
                '}';
    }
}
