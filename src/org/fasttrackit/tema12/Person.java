package org.fasttrackit.tema12;

import java.util.ArrayList;
import java.util.List;

public class Person {

        String name;
        int age;
        String hairColour;


        public Person(String name, int age, String hairColour) {

            this.name = name;
            this.age = age;
            this.hairColour = hairColour;

        }

        public String getName() {

            return this.name;
        }

        public int getAge() {

            return this.age;
        }

        public String getHairColour() {

            return this.hairColour;
        }

        public String toString() {
            return this.name + " " + this.age + " " + this.hairColour;
        }

}
