package org.fasttrackit.tema12.ExtraMile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Car {

    private String name;

    private int age;

    private double kilometers;

    private double price;



    public Car(String name, int age, double kilometers, double price) {
        this.name = name;
        this.age = age;
        this.kilometers = kilometers;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getKilometers() {
        return this.kilometers;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        return name + " " + age + " " + kilometers + " " + price;
    }


}
