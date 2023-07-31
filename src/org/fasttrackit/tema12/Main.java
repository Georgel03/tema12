package org.fasttrackit.tema12;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //EX 1

        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("George", 10);
        studentGrades.put("Andreea", 9);
        studentGrades.put("Ana", 8);
        studentGrades.put("Stefan", 5);
        studentGrades.put("Raul", 10);
        studentGrades.put("Tony", 4);

        int maxStudentGrade = findGreaterGrade(studentGrades);
        System.out.println(String.format("Student %s has the greatest grade: %d", getKeys(studentGrades, maxStudentGrade), maxStudentGrade));

        System.out.println("-------------------------------------------------");

        //EX 2

        Person personOne = new Person("George", 20, "Blond");
        Person personTwo = new Person("Mihai", 21, "Blond");
        Person personThree= new Person("Ana", 24, "Saten");
        Person personFour = new Person("Amalia", 23, "Castaniu");
        Person personFive = new Person("Mircea", 25, "Negru");
        List<Person> people = new ArrayList<>();
        people.add(0, personOne);
        people.add(1, personTwo);
        people.add(2, personThree);
        people.add(3, personFour);
        people.add(4, personFive);

        //2.1
        List<String> peopleName = extractNameOfPeople(people);
        System.out.println("The names of the people: " + peopleName);

        //2.2
        Map<String, Integer> firstMap = putAgeNameIntoMap(people);
        System.out.println("First map is: " + firstMap);

        //2.3
        List<String> peopleOlderThan = extractPeopleOlderThan(23, firstMap);
        System.out.println(peopleOlderThan);

        //2.4
        Map<String, List<String>> secondMap = putHairNameIntoMap(people);
        System.out.println("Second map is: " + secondMap);

        //2.5
        Map<Integer, List<Person>> thirdMap = putAgeListIntoMap(people);
        for (Map.Entry<Integer, List<Person>> listEntry : thirdMap.entrySet()) {
            System.out.println("Age: " + listEntry.getKey() + ", Name: " + listEntry.getValue());
        }

        System.out.println("---------------------------------------------------------------------");

        //EX 3
        Employee employeeOne = new Employee("George", 20, "Blond", "Transstance", 2500);
        Employee employeeTwo = new Employee("Mihai", 20, "Blond", "Holcim", 1250);
        Employee employeeThree = new Employee("Amalia", 24, "Saten", "Transstance", 5000);
        Employee employeeFour = new Employee("Bogdi", 22, "Negru", "Holcim", 1500);
        Employee employeeFive = new Employee("Renata", 21, "Roscata", "Spital", 3000);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employeeOne);
        employeeList.add(employeeTwo);
        employeeList.add(employeeThree);
        employeeList.add(employeeFour);
        employeeList.add(employeeFive);

        //3.1
        List<Employee> peopleSalary = extractSpecSalary(2250, employeeList);
        System.out.println(peopleSalary.toString());

        //3.2
        Map<String, Double> mapCompany = extractPeopSpecComp("Holcim", employeeList);
        System.out.println(mapCompany.toString());

        //3.3
        System.out.println("The sum of all employeers is: " + calculateSalaries(employeeList));

        //3.4
        System.out.println("The Highest salary is given by: " + calcCompBestSalary(employeeList));
    }

    public static int findGreaterGrade(Map<String, Integer> myMap) {

        int maxGrade = Integer.MIN_VALUE;

        for (Integer grade : myMap.values()) {
            if (grade >= maxGrade) {
                maxGrade = grade;
            }
        }

        return maxGrade;
    }

    public static  <String, Integer> Set<String> getKeys(Map<String, Integer> map, int value) {
        Set<String> keys = new HashSet<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }

    public static List<String> extractNameOfPeople(List<Person> myList) {

        List<String> personNameList = new ArrayList<>();
        for (Person person : myList) {
            personNameList.add(person.getName());
        }

        return personNameList;
    }

    public static Map<String, Integer> putAgeNameIntoMap(List<Person> personList) {

        Map<String, Integer> myMap = new HashMap<>();
        for (Person person : personList) {
            myMap.put(person.getName(), person.getAge());
        }

        return myMap;
    }

    public static List<String> extractPeopleOlderThan(int age, Map<String, Integer> map) {

        List<String> peopleOlderThan = new ArrayList<>();
        for (String person : map.keySet()) {
            if (map.get(person) > age) {
                peopleOlderThan.add(person);
            }
        }

        return peopleOlderThan;
    }

    public static Map<String, List<String>> putHairNameIntoMap(List<Person> personList) {

        Map<String, List<String>> myMap = new HashMap<>();
        for (Person person : personList) {
            String hairColour = person.getHairColour();
            String name = person.getName();

            if (!myMap.containsKey(hairColour)) {
                myMap.put(hairColour, new ArrayList<>());
            }

            myMap.get(hairColour).add(name);
        }

        return myMap;
    }

    public static Map<Integer, List<Person>> putAgeListIntoMap(List<Person> personList) {

        Map<Integer, List<Person>> myMap = new HashMap<>();

        for (Person person : personList) {

            int agePerson = person.getAge();

            if (!myMap.containsKey(agePerson)) {
                myMap.put(agePerson, new ArrayList<>());
            }

            myMap.get(agePerson).add(person);
        }

        return myMap;
    }

    public static List<Employee> extractSpecSalary(double amount, List<Employee> myList) {


        List<Employee> peopleSalary = new ArrayList<>();

        for (Employee employee : myList) {
            if (employee.getSalary() >= amount) {
                peopleSalary.add(employee);
            }
        }

        return peopleSalary;
    }

    public static Map<String, Double> extractPeopSpecComp(String company, List<Employee> myList) {

        Map<String, Double> myMap = new HashMap<>();
        for (Employee employee : myList) {
            if (employee.getCompany().equals(company)) {
                myMap.put(employee.getName(), employee.getSalary());
            }
        }

        return myMap;
    }

    public static Double calculateSalaries(List<Employee> myList) {

        double amount = 0;
        for (Employee employee : myList) {
            amount += employee.getSalary();
        }

        return amount;
    }

    public static String calcCompBestSalary(List<Employee> myList) {

        String company = new String();
        double maxSalary = Integer.MIN_VALUE;
        for (Employee employee : myList) {
            if (employee.getSalary() > maxSalary) {
                company = employee.getCompany();
                maxSalary = employee.getSalary();
            }
        }

        return company;
    }



}