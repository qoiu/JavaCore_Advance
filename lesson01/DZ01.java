package ru.geekbrains.java02.lesson01;

public class DZ01 {
    public static void main(String[] args){
        Creature[] creatures= {
            new Cat("Барсик"),
            new Human("Вася"),
            new Cat("Багира"),
            new Robot("C3PO"),
            new Cat("Рыжик"),
            new Human("Петя"),
            new Robot("R2D2"),
        };
        Difficulty[] difficulties={
            new Track(100),
            new Wall(5),
            new Track(120),
            new Wall(8),
            new Wall(10),
            new Track(200)
        };
        for (int z=0;z<difficulties.length;z++)
            for (int i = 0; i<creatures.length; i++)
                difficulties[z].challenge(creatures[i]);
        }
    }


