package com.qa.animals;


//declaring as abstract means it wont let anyone make an animal of type animal
public abstract class Animal {
    //define properties, need to be private so they can only be accessed via getters
    private String name = "default";
    private String sound = "silent";
    private int age = 0;


    //define getters for properties

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getSound(){
        return sound;
    }


    //define constructor, they have same class name as thing they're in

    public Animal(){
        System.out.println("Animal was created");
        name = "default";

    }

    public Animal(String name, int age, String sound){
        setName(name);
        setAge(age);
        setSound(sound);
    }


    //define setters for properties

    public void setAge(int value){
        age = value;
    }

    public void setName(String value){
        name = value + "####";
    }
    //for this setter, the code is written differently to show a different method - the this. refers to the sound
    // in this class, not the one passed through the setter, to avoid confusion
    public void setSound(String sound){
        this.sound = sound;
    }


}
