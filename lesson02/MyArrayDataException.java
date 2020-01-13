package ru.geekbrains.java02.lesson02;

class MyArrayDataException extends NumberFormatException{
    private String report;


    MyArrayDataException(String s, int i, int k) {
        this.report="Ошибка значения в "+s+"[" + i + "]["+k+"]";
    }

    String getReport() {
        return report;
    }
}
