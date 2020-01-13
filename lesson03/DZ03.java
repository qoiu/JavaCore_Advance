package ru.geekbrains.java02.lesson03;

import java.util.*;

public class DZ03 {
    public static class PhoneBook{
        private HashMap<String,LinkedList<String>> phones=new HashMap<>();
        PhoneBook() {}
        void add(String name, String phoneNumber) {
            if(!phones.containsKey(name))phones.put(name,new LinkedList<>());
                phones.get(name).add(phoneNumber);
        }
        LinkedList getPhones(String name) {
            return phones.get(name);
        }
    }

    public static void main(String[] args){
        ArrayList<String> fruits=new ArrayList<>(Arrays.asList(
                "яблоко","банан","апельсин","персик","мандарин","киви","апельсин","персик","ананас","лимон","киви","персик","апельсин","киви","апельсин"
        ));
        System.out.println(getUniq(fruits));
        System.out.println(countArr(fruits));
        //Задание 2
        PhoneBook pb=new PhoneBook();
        pb.add("Иванов","8-981-899-85-55");
        pb.add("Иванов","8-800-300-00-60");
        pb.add("Козлов","8-911-235-62-34");
        pb.add("Петров","325-65-19");
        pb.add("Иванов","8-800-300-00-60");
        System.out.println(pb.getPhones("Иванов"));
        System.out.println(pb.getPhones("Петров"));
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
