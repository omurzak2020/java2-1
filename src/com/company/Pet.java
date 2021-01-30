package com.company;

import java.util.Random;

public class Pet {

    private int age = genarateDefaultAge();
    private Color color;
    private Shelter shelter;

    public Pet() {
    }

    public Pet(Color color, Shelter shelter) {
        this.color = color;
        this.shelter = shelter;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public Color getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public Shelter getShelter() {
        return shelter;
    }

    private int genarateDefaultAge(){
   //     Random r = new Random();
   /*     int x  = r.nextInt(20);
        return x;*/
        return (int) (Math.random()*10+15);
    }

    public String getInfo(){
        if (shelter != null){
    return "Pet = ["+"\n age = "+age+
            "\ncolor = "+color+
            "\nshelter = " + shelter.getName()+
            "\n ]";
    }else {
            return "Pet = ["+"\n age = "+age+
                    "\ncolor = "+color+
                    "\n ]";
        }
    }
}
