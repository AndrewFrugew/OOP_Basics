package com.epam;

public class Application {
    public static void main(String[] args) {
        Animal myDog = new Dog("Barbos", "Buldog", "Brown", 3);
       // System.out.println(myDog);

        Animal myCat = new Cat("Meri","home","gray",5, "green", 15);
        //System.out.println(myCat);
       Animal animal = new Animal("Noname", "Bibrka","red");
       print(animal);
        print(myDog);
        print(myCat);
    }
    public static void print(Animal animal){
        System.out.println(animal);
        System.out.println(animal.sound());

    }
}