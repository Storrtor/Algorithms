package com.stortor.sort.lesson2.task2;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(Integer[] arr) {
        boolean isChanged;
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            int max = arr.length - i - 1;
            isChanged = false;

            if (min == arr.length/2-1 && max == arr.length/2) {
                if (arr[min] > arr[max]) {
                    int temp = arr[min];
                    arr[min] = arr[max];
                    arr[max] = temp;
                    isChanged = true;
                }
                break;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                    isChanged = true;
                }
                if (arr[arr.length - 1 - j] > arr[max]) {
                    max = arr.length - 1 - j;
                    isChanged = true;
                }
            }

            if (!isChanged) {
                break;
            }
            int tempMin = arr[i];
            arr[i] = arr[min];
            arr[min] = tempMin;

            int tempMax = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[max];
            arr[max] = tempMax;

            System.out.println("i: " + i + ", array = " + Arrays.toString(arr));
        }


    }
}
