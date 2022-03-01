package com.stortor.sort.lesson3;

public class Main {
    public static void main(String[] args) {
        int[] arrayFirst = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16}; // 11
        int[] arraySecond = {1, 2, 4, 5, 6}; // 3
        int[] arraySe = {2, 3, 4, 5, 6, 7, 8, 9, 10}; // 1
        int[] arrayThird = {}; //1
        findMissedNumber(arrayFirst);
        findMissedNumber(arraySecond);
        findMissedNumber(arrayThird);
        findMissedNumber(arraySe);
    }

    public static void findMissedNumber(int[] array) {
        if (array.length == 0) {
            System.out.println(1);
            return;
        }
        if (array[0] != 1) {
            System.out.println(1);
            return;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] != 1) {
                System.out.println(array[i] + 1);
                return;
            }
        }
        System.out.println(array[array.length - 1] + 1);
    }
}
