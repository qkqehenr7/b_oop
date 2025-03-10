package com.grepp.oop.d_ingeritance.c_before;

public class SmartPhone {

    private String brand;
    private String name;
    private int price;
    private String cpu;
    private String agency;

    public SmartPhone(String brand, String name, int price, String cpu, String agency) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.cpu = cpu;
        this.agency = agency;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
            "brand='" + brand + '\'' +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", cpu='" + cpu + '\'' +
            ", agency='" + agency + '\'' +
            '}';
    }
}
