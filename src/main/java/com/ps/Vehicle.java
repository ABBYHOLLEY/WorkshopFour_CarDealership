package com.ps;

import java.time.LocalDate;

//vin|year|make|model|vehicleType|color|odometer|price
public class Vehicle {
    private String vin;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private int odometer;
    private int price;

    public Vehicle(String vin, int year, String make, String model, String color, int odometer, String vehicleType, int price)
    {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.odometer = odometer;
        this.vehicleType = vehicleType;
        this.price = price;
    }

    public Vehicle(String vin, int year, String make, String model, String vehicleType, String vehicleColor, int odometer, int price) {
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vin='" + vin + '\'' +
                ", year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", color='" + color + '\'' +
                ", odometer=" + odometer +
                ", price=" + price +
                '}';
    }
}
