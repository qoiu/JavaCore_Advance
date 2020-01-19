package lesson05;

import java.awt.*;
import java.util.Arrays;

public class DZ05 {
    static final int size = 10000000;
    static final int half = size / 2;

    public static <call> void main(String[] args){
        noThread();
        withThread();
    }
    private static void noThread(){
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
       for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Один поток: "+(System.currentTimeMillis() - a));
    }
    public static void withThread(){
        float[] arr = new float[size];
        float[] a1 = new float[half];
        float[] a2 = new float[half];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, half);
        System.arraycopy(arr, half, a2, 0, half);
        System.out.println("Два потока - бьём массив:  "+(System.currentTimeMillis() - a));
        a = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        });
        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Два потока - подсчёт: "+(System.currentTimeMillis() - a));
        a = System.currentTimeMillis();
        System.arraycopy(a1, 0, arr, 0, half);
        System.arraycopy(a2, 0, arr, half, half);
        System.out.println("Два потока - сборка: "+(System.currentTimeMillis() - a));
    }
    public static void th1(){

    }
}
