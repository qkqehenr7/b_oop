package com.grepp.oop.c_encapsulation.method;

public class Player {

    private String instrument;

    public Player(String instrument) {
        this.instrument = instrument;
    }

    public void prepare(){
        System.out.println(instrument + " 연주 준비합니다.");
    }

    public void readNote(){
        System.out.println(instrument + " 악보를 봅니다.");
    }

    public void playing(){
        System.out.println(instrument + " 연주를 합니다.");
    }

    public void end(){
        System.out.println("연주를 마칩니다.");
    }
}
