package com.stortor.sort.lesson2.task1;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(Notebook[] arr) {
//        System.out.println(Arrays.deepToString(arr));
        boolean isChanged;
        do {
            isChanged = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].getPrice() > arr[i + 1].getPrice()) {
                    Notebook temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isChanged = true;
                }
                if (arr[i].getPrice() == arr[i+1].getPrice()) {
                    if (arr[i].getRam() > arr[i+1].getRam()) {
                        Notebook temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        isChanged = true;
                    }
                    if (arr[i].getRam() == arr[i+1].getRam()) {
                        if (producerPriority(arr[i]) < producerPriority(arr[i+1])) {
                            Notebook temp = arr[i];
                            arr[i] = arr[i + 1];
                            arr[i + 1] = temp;
                            isChanged = true;
                        }
                    }
                }
            }
//            System.out.println(Arrays.deepToString(arr));
        } while (isChanged);
//        System.out.println(Arrays.deepToString(arr));
    }

    private static int producerPriority(Notebook note) {
        int priority = 0;
        switch (note.getProducer()) {
            case "Lenovo":
                priority = 5;
                break;
            case "Asus":
                priority = 4;
                break;
            case "MacNote":
                priority = 3;
                break;
            case "Acer":
                priority = 2;
                break;
            case "Xiaomi":
                priority = 1;
        }
//        System.out.println("priority = " + priority);
        return priority;
    }
}
