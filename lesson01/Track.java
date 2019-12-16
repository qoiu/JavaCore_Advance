package ru.geekbrains.java02.lesson01;

public class Track implements Difficulty {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Track(int lenth) {
        this.length = lenth;
    }

    @Override
    public boolean challenge(Creature creature) {
        return creature.run(length);
    }
}
