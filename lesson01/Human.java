package ru.geekbrains.java02.lesson01;

public class Human implements Creature  {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name+" бежит");
    }

    @Override
    public void jump() {
        System.out.println(name+" прыгает");
    }
}
