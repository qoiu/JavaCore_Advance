package ru.geekbrains.java02.lesson01;

public class DZ01 {
    public static void main(String[] args){
        Creature[] creatures= {
            new Cat("Барсик",6,90),
            new Human("Вася",8,120),
            new Cat("Багира",8,100),
            new Robot("C3PO",0,35),
            new Robot("EpicChampion3000",40,1000),
            new Cat("Рыжик",9,110),
            new Human("Петя",9,120),
            new Robot("R2D2",0,40),
        };
        Difficulty[] difficulties={
            new Track(30),
            new Wall(5),
            new Track(100),
            new Wall(8),
            new Wall(10),
            new Track(200),
            new Finish()
        };
        for (int i = 0; i<creatures.length; i++)
            for (int z=0;z<difficulties.length;z++)
               if (!difficulties[z].challenge(creatures[i]))break;
        }
    }


