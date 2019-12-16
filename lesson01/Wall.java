package ru.geekbrains.java02.lesson01;

public class Wall implements Difficulty {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void challenge(Creature creature) {
        creature.jump();
    }
}
