package com.grepp.oop.f_interface;

public class Device {
    // private 은 상속되지 않는다.
    protected String brand;
    protected String name;
    protected int price;

    public Device(String brand, String name, int price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public void on(){
        System.out.println(name + " 켰습니다.");
    }
}
