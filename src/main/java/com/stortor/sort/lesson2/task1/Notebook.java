package com.stortor.sort.lesson2.task1;

public class Notebook {
    private int price;
    private int ram;
    private String producer;

    public Notebook(int price, int ram, String producer) {
        this.price = price;
        this.ram = ram;
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public static int generatePrice() {
        int price = (int) (Math.random() * (2000 - 500) + 500);
        return roundToNearest(price, 50);
    }

    public static int generateRam() {
        int ram = (int) (Math.random() * (24 - 4) + 4);
        return roundToNearest(ram, 4);
    }

    public static String generateProducer() {
        int ram = (int) ((Math.random() * 5) + 1);
        String producer = "";
        switch (ram) {
            case 1:
                producer = "Lenovo";
                break;
            case 2:
                producer = "Asus";
                break;
            case 3:
                producer = "MacNote";
                break;
            case 4:
                producer = "Acer";
                break;
            case 5:
                producer = "Xiaomi";
        }
        return producer;
    }

    private static int roundToNearest(int number, int delta) {
        if (number % delta < delta/2) {
            return number - (number % delta);
        } else {
            return number + (delta - (number % delta));
        }
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", ram=" + ram +
                ", producer='" + producer + '\'' +
                '}';
    }
}