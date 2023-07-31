package org.fasttrackit.tema12.ExtraMile;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainMiles {

    public static void main(String[] args) {

        Car carOne = new Car("Mercedes", 12, 220000D, 4000D);
        Car carTwo = new Car("BMW", 8, 400000D, 3000D);
        Car carThree = new Car("Audi", 5, 120000D, 20000D);
        Car carFour = new Car("Audi", 30, 20000D, 50000D);
        Shop shop = new Shop("LaVericu", 0, 0, 0);
        shop.carList.add(carOne);
        shop.carList.add(carTwo);
        shop.carList.add(carThree);
        shop.carList.add(carFour);



        //5.1
        System.out.println("The number of AUDI'S is :" + getNumberofSpecCar("Audi", shop.carList));
        Map<String, Integer> mapNameToNumOfCar = createMapCarNameToNumOfCars(shop.carList);
        System.out.println(mapNameToNumOfCar.toString());

        //5.2
        Map<String, Double> mapNameToSumOfKilo = createMapCarNameToSumOfKilo(shop.carList);
        System.out.println(mapNameToSumOfKilo.toString());

        //5.3
        List<Range> rangeList = createRangeList();
        Map<Range, List<Car>> mapRangeToCarName = createMapRangeKmToList(shop.carList, rangeList);
        System.out.println(mapRangeToCarName);

        //5.4
        List<PriceRange> priceRanges = createRangeCashList();
        Map<PriceRange, List<Car>> mapCashRange = createMapRangePriceToList(shop.carList, priceRanges);
        System.out.println(mapCashRange);

    }

    public static List<PriceRange> createRangeCashList() {

        List<PriceRange> rangeList = new ArrayList<>();
        int j = 0;
        for (int i = 10000; i <= 100000; i += 10000) {
            PriceRange range = new PriceRange(j, i);
            rangeList.add(range);
            j = i + 1;
        }

        return rangeList;

    }

    public static List<Range> createRangeList() {

        List<Range> rangeList = new ArrayList<>();
        int j = 0;
        for (int i = 100000; i <= 1000000; i += 100000) {
            Range range = new Range(j, i);
            rangeList.add(range);
            j = i + 1;
        }

        return rangeList;

    }
    public static int getNumberofSpecCar(String name, List<Car> myList) {

        int number = 0;

        for (Car car : myList) {
            if (car.getName().equals(name)) {
                number++;
            }
        }

        return number;
    }

    public static double getKilometersOfSpecCar(String name, List<Car> myList) {

        double kilometers = 0;

        for (Car car : myList) {

            if (car.getName().equals(name)) {
                kilometers += car.getKilometers();
            }
        }

        return kilometers;
    }

    public static Map<String, Integer> createMapCarNameToNumOfCars(List<Car> myList) {

        Map<String, Integer> myMap = new HashMap<>();
        for (Car car : myList) {
            myMap.put(car.getName(), getNumberofSpecCar(car.getName(), myList));
        }

        return myMap;
    }

    public static Map<String, Double> createMapCarNameToSumOfKilo(List<Car> myList) {

        Map<String, Double> myMap = new HashMap<>();
        for (Car car : myList) {
            myMap.put(car.getName(), getKilometersOfSpecCar(car.getName(), myList));
        }

        return myMap;

    }

    public static Map<Range, List<Car>> createMapRangeKmToList(List<Car> myList, List<Range> rangeList) {
        Map<Range, List<Car>> myMap = new HashMap<>();
        for (Car car : myList) {
            for (Range range : rangeList) {
                if (car.getKilometers() >= range.getMinKm() && car.getKilometers() <= range.getMaxKm()) {
                    if (!myMap.containsKey(range)) {
                        myMap.put(range, new ArrayList<>());
                    }

                    myMap.get(range).add(car);
                }
            }

        }

        return myMap;
    }

    public static Map<PriceRange, List<Car>> createMapRangePriceToList(List<Car> myList, List<PriceRange> rangeList) {
        Map<PriceRange, List<Car>> myMap = new HashMap<>();
        for (PriceRange range : rangeList) {
            for (Car car : myList) {
                if (car.getPrice() >= range.getMinCash() && car.getPrice() <= range.getMaxCash()) {
                    if (!myMap.containsKey(range)) {
                        myMap.put(range, new ArrayList<>());
                    }

                    myMap.get(range).add(car);
                }
            }

        }

        return myMap;
    }


}
