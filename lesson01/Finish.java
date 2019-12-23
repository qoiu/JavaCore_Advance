package ru.geekbrains.java02.lesson01;

public class Finish implements Difficulty {
    @Override
    public boolean challenge(Creature creature) {
        System.out.println(creature.getName()+" успешно преодолел все препятствия");
        return true;
    }
}
