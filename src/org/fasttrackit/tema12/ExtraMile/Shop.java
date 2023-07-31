package org.fasttrackit.tema12.ExtraMile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop extends Car{

    List<Car> carList;
    public Shop(String name, int age, double kilometers, double price) {
        super(name, age, kilometers, price);
        this.carList = new ArrayList<>();
    }


}
