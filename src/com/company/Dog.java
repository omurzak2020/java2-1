package com.company;

import java.security.SecureRandom;
import java.util.Arrays;

public class Dog extends Pet{
    private String name;
    private String breed;
    private String [] commands;

    public Dog() {

    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        super(color,shelter);
        this.name = name;
        this.breed = breed;
    }

    public Dog(Color color, Shelter shelter, String name, String breed, String[] commands) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
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

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makecoice(String voice, int numder){
        for (int i = 0; i < numder; i++) {
            System.out.printf(voice);
        }
    }

    public void makeVoice(String voice, int number){

    }
    public void makeVoice( int number,String volice){
        for (int i = 0; i < number; i++) {
            System.out.printf(volice);
        }
    }
    @Override
    public String getInfo(){
        return "dog = ["+"" +
                "\n name = "+name+
                "\nbreed = "+breed+
                "\ncommands = " + Arrays.toString(commands) +
                "\n ]"+"\n"+super.getInfo();
    }
}
