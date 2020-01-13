package ru.geekbrains.java02.lesson02;

public class DZ02 {
    public static void main(String[] args){
        String[][] str= {
                {"123","12","12","5"},
                {"1","2","34","12"},
                {"23","35","23","12"},
                {"15","8","21","13"}
        };
        try{
            System.out.println(sumArray(str));
        }catch (MyArrayDataException e){
            System.out.println(e.getReport());
        }catch (MyArraySizeException e){
            System.out.println(e.getReport());
        }

    }
    private static int sumArray(String[][] arr){
        int summ=0;
        if (arr.length>4)throw new MyArraySizeException("arr(размер: "+ arr.length+") ");
        for(int i=0;i<arr.length;i++){
            if (arr[i].length>4)throw new MyArraySizeException("arr["+i+"] (размер: "+ arr[i].length+") ");
            for(int k=0;k<arr[i].length;k++){
                try{
                    summ+=Integer.parseInt(arr[i][k]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("arr",i,k);
                }
            }
        }
        return summ;
    }
}
