package ru.geekbrains.java02.lesson03;

import java.util.*;

public class DZ03 {
    public static void main(String[] args){
        ArrayList<String> fruits=new ArrayList<>(Arrays.asList(
                "яблоко","банан","апельсин","персик","мандарин","киви","апельсин","персик","ананас","лимон","киви","персик","апельсин","киви","апельсин"
        ));
        System.out.println(getUniq(fruits));
        System.out.println(countArr(fruits));
    }

    private static ArrayList<String> getUniq(ArrayList<String> arr){
        ArrayList<String> out=new ArrayList<>();
        for (String o: arr) {
            if(Collections.frequency(arr,o)==1)out.add(o);
        }
        return out;
    }
    private static HashMap<String,Integer> countArr(ArrayList<String> arr){
        HashMap<String,Integer> out=new HashMap<>();
        for (String o: arr) {
            out.put(o,Collections.frequency(arr,o));
        }
        return out;
    }
}
