package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setName("Рекс");
        dog1.setBreed("Немецкая овчарка");
        String[] commands = {"сидеть","дежать","прыгать"};
        dog1.setCommands(commands);
        System.out.printf(dog1.getInfo());
        dog1.makeVoice("Гаф-гаф",1);

        Dog dog2 = new Dog("Лайка","Алабай",Color.BLACK,
                new Shelter("Привет №1","Советская 175"));
       dog2.setCommands(commands);
        System.out.printf(dog2.getInfo());
        dog2.makeVoice("Тяф-тяф",2);

        Shelter shelter = new Shelter("Привет №2","Токтогулова 175");
        Dog dog3 = new Dog(Color.BROWN,shelter,"Алгыр","Чихуахуа",commands);
        dog3.makeVoice(5,"Gav");

        System.out.printf(dog3.getInfo());
    }
}
