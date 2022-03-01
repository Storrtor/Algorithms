package com.stortor.sort.lesson5.task2;

public class Backpack {

    public static int[] values;
    public static int[] weights;
    public static final int W = 5;

    public static void main(String[] args) {
        // найти самое дорогое, если помещается только 5 кг
        Product laptop = new Product("Laptop", 500, 3);
        Product clock = new Product("Clock", 230, 1);
        Product umbrella = new Product("Umbrella", 10, 1);
        Product dumbbell = new Product("Dumbbell", 10, 3);
        Product smartphone = new Product("Smartphone", 70, 2);

        values = new int[]{laptop.getPrice(), clock.getPrice(), umbrella.getPrice(), dumbbell.getPrice(), smartphone.getPrice()};
        weights = new int[]{laptop.getWeight(), clock.getWeight(), umbrella.getWeight(), dumbbell.getWeight(), smartphone.getWeight()};
        System.out.println(findExp(values.length - 1, W));
    }

    private static int findExp(int i, int W) {
        if (i < 0) {
            return 0;
        }
        if (weights[i] > W) {
            return findExp(i-1, W);
        } else {
            return Math.max(findExp(i-1, W), findExp(i-1, W - weights[i]) + values[i]);
        }
    }


}
