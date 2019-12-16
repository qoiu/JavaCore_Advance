package ru.geekbrains.java02.lesson01;

public class Human implements Creature  {
    private String name;
    private int limJump;
    private int limRun;

    public Human(String name, int limJump, int limRun) {
        this.name = name;
        this.limJump = limJump;
        this.limRun = limRun;
    }

    public int getLimJump() {
        return limJump;
    }

    public void setLimJump(int limJump) {
        this.limJump = limJump;
    }

    public int getLimRun() {
        return limRun;
    }

    public void setLimRun(int limRun) {
        this.limRun = limRun;
    }

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    public boolean run(int lenght) {
        if(limRun>=lenght) {
            System.out.println(name+" пробежал");
            return true;
        }else{
            System.out.println(name+" не пробежал");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if(limJump>=height) {
            System.out.println(name + " прыгнул");
            return true;
        }else {
            System.out.println(name + " не прыгнул");
            return false;
        }
    }

}
