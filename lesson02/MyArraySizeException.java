package ru.geekbrains.java02.lesson02;

class MyArraySizeException extends ArrayIndexOutOfBoundsException{
    private String arrName;

    MyArraySizeException(String arrName) {
        this.arrName = arrName;
    }

    String getReport() {
        return "В массиве "+arrName+" превышена размерность";
    }
}
