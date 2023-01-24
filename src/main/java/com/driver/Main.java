package com.driver;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        /*Boat b = new Boat("Titanic",2000);
        System.out.println(b.getVehicleName());
        System.out.println(b.getVehicleCapacity());*/
    }
}