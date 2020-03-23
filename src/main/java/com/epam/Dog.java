package com.epam;

public  class Dog extends Animal {

    private int angerLevel;

    public Dog(String name, String breed, String color,int angerLevel) {
        super(name, breed, color);
        this.angerLevel = angerLevel;
    }
    @Override
    public String sound(){
        return "gav-gav";
    }
    @Override
    public String toString(){
        return "Dog -" + super.toString() +
                " angerLevel=" + angerLevel + '}';
}
}