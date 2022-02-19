package com.stortor.sort.lesson2.task1;

import java.util.Arrays;

//SelectionSort
// выбор, вставка, пузырек

public class MainSort {

    private static Long time;

    public static void main(String[] args) {
        Notebook[] array = getArray(10000);
        startTime();
        BubbleSort.sort(array);
        endTime();
    }

    public static Notebook[] getArray(int length) {
        Notebook[] arr = new Notebook[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Notebook(Notebook.generatePrice(), Notebook.generateRam(), Notebook.generateProducer());
        }
        return arr;
    }

    public static void startTime() {
        time = System.currentTimeMillis();
    }

    public static void endTime() {
        time = System.currentTimeMillis() - time;
        System.out.println(time);
    }

}