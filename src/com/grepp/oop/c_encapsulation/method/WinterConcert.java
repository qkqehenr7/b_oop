package com.grepp.oop.c_encapsulation.method;

public class WinterConcert {

    public void startConcert(){
        System.out.println("봄 콘서트를 시작합니다!");
        Player player = new Player("바이올린");
        player.prepare();
        player.readNote();
        player.playing();
        player.end();
        System.out.println("봄 콘서트 마칩니다.");
    }

}
