package com.stortor.sort.lesson2;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(generatePrice());
        }
    }

    public static int generatePrice() {
        int price = (int) (Math.random() * (2000 - 500) + 500);
        return roundToNearest(price);
    }


    private static int roundToNearest(int x) {
        if (x % 50 < 25) {
            return x - (x % 50);
        } else {
            return x + (50 - (x % 50));
        }
    }
}
