package com.grepp.oop.d_ingeritance.c_before;

public class Tv {

    private String brand;
    private String name;
    private int price;
    private int size;

    public Tv(String brand, String name, int price, int size) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tv{" +
            "brand='" + brand + '\'' +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", size=" + size +
            '}';
    }
}
