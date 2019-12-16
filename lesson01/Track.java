package ru.geekbrains.java02.lesson01;

public class Track implements Difficulty {
    private int lenth;

    public int getLenth() {
        return lenth;
    }

    public void setLenth(int lenth) {
        this.lenth = lenth;
    }

    public Track(int lenth) {
        this.lenth = lenth;
    }

    @Override
    public void challenge(Creature creature) {
        creature.run();
    }
}
