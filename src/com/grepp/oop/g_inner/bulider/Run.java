package com.grepp.oop.g_inner.bulider;

public class Run {

    public static void main(String[] args) {
        // 1. 점층적 생성자 패턴
        // 매개변수가 있는 생성자를 사용해 객체를 초기화
        // 가독성이 안 좋다
        //Book book = new Book("차차차", "차은우", 500, false);

        // 2. 자바 Bean 패턴
        // 기본생성자로 객체를 생성하고 setter를 통해 값을 초기화
        // 모든 권한에 대해 수정권한이 열려있다. immutable 한 객체를 만들 수 없다.

        // 3. Builder 패턴
        Book book = new Book.Builder()
            .title("해리포터")
            .author("조앤롤링")
            .price(500)
            .activated(false)
            .build();

        System.out.println(book);
    }

}
