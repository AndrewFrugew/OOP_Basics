package com.epam;

public class Cat extends Animal{
    private int clawOnPaw;
    private String eyeColor;
    private int miceCaughtNumber;

    public Cat (String name, String breed, String color, int clawOnPaw, String eyeColor, int miceCaughtNumber){
        super(name, breed, color);
        this.clawOnPaw = clawOnPaw;
        this.eyeColor = eyeColor;
        this.miceCaughtNumber = miceCaughtNumber;
    }
    @Override
    public String sound(){
        return "mew-mew";
}
    @Override
    public String toString(){
        return "Cat -" + super.toString() + "clawOnPaw= '" +"'" + clawOnPaw + " eyeColor= '" + eyeColor +"'"+ "miceCaughtNumber= '" + miceCaughtNumber+ "'";

    }
}
