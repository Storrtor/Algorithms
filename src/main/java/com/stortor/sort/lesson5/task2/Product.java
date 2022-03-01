package com.stortor.sort.lesson5.task2;

public class Product {
    private String name;
    private int weight;
    private int price;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Product(String name) {
        this.name = name;
    }
}
