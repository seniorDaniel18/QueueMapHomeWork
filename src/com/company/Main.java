package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(1, 777);
        Car car2 = new Car(2, 125);
        Car car3 = new Car(3, 322);

        CarParameter cars1 = new CarParameter(1990, "Mercedes", 5000000, "Dark Blue");
        CarParameter cars2 = new CarParameter(2020, "Telsa", 10000000, "White");
        CarParameter cars3 = new CarParameter(2016, "Rolls Royce", 8000000, "Black");

        Map<Car, CarParameter> auto = new HashMap();

        auto.put(car1, cars1);
        auto.put(car2, cars2);
        auto.put(car3, cars3);

        for(Car a : auto.keySet()){
            System.out.println(a + " " + auto.get(a));
        }
    }
}