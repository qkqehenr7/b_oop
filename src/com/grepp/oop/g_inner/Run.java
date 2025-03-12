package com.grepp.oop.g_inner;

import com.grepp.oop.g_inner.A_OuterClass.InstanceInner;
import com.grepp.oop.g_inner.A_OuterClass.StaticInner;

public class Run {

    public static void main(String[] args) {

        StaticInner staticInner = new A_OuterClass.StaticInner();
        staticInner.print();

        A_OuterClass a = new A_OuterClass("outer");
        InstanceInner instanceInner = a.new InstanceInner();
        instanceInner.print();

        a.localClass();
    }

}
