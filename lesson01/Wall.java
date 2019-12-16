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
    public boolean challenge(Creature creature) {
        return creature.jump(height);
    }
}
