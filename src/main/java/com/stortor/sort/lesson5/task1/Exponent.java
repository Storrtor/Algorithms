package com.stortor.sort.lesson5.task1;

// Task 1
public class Exponent {
    public static void main(String[] args) {
        System.out.println(degree(3, 10));
    }

    public static long degree(int num, int degreeNum) {
        if (degreeNum == 1) {
            return num;
        }
        return num * degree(num, degreeNum - 1);
    }
}
