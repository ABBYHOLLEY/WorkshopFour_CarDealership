package com.ps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

// User will be able to:
// Find vehicles within price range
// Find vehicle by make and model
// Find vehicles by year range
// Find vehicles by mileage range
// Find vehicles by type (car, truck, suv)
// List all vehicles
// Add vehicle
// Remove vehicle
// Quit
// Refer to leger app for help
public class UserInterface {
    static Scanner commandscanner = new Scanner(System.in);
    static Scanner inputScanner = new Scanner(System.in);
    static ArrayList<Vehicle>allVehiclesInInventory = new ArrayList<>();

    public static void loadAll(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("dealership.csv"));

            String firstLine = bufferedReader.readLine();
            String input;

            while ((input = bufferedReader.readLine())!= null){
                String[] dealershiparray = input.split("\\|");

                String vin = dealershiparray[0];
                int year = Integer.parseInt(dealershiparray[1]);
                String make = dealershiparray[2];
                String model = dealershiparray[3];
                String vehicleType = dealershiparray[4];
                String vehicleColor = dealershiparray[5];
                int odometer = Integer.parseInt(dealershiparray[6]);
                int price = Integer.parseInt(dealershiparray[7]);

               Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, vehicleColor, odometer, price);
               allVehiclesInInventory.add(vehicle);
            }
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // private static Dealership dealership;
    public static void init(){
        System.out.println("Init method");
        // Loading dealership and inventory from file
    }
    public static void display(){
        init();
        System.out.println("Load menu");
        // Load menu
    }
}
