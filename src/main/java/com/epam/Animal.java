package com.epam;

public  class Animal {
    private String name;
    private String breed;
    private String color;

    public Animal (String name, String breed, String color){
        this.name = name;
        this.breed = breed;
        this.color = color;
    }
    public String sound(){
        return "uhu-hu";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
 @Override
    public String toString(){
        return " Animal {" +
             " name='" + name +"'"+
                " , breed= '" + breed +"'"+
                " , color ='" + color + "'" ;

 }




}
