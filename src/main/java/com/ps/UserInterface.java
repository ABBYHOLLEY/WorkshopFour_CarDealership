package com.ps;

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
