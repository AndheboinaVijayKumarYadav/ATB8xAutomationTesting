package com.vijay.testing.sampleCheck;

public class NoDesignPattern {
    public void step1(){
        System.out.println("step1");
    }
    public void step2(){
        System.out.println("step2");
    }

    public void step3(){
        System.out.println("step3");
    }

    public static void main(String[] args) {
        NoDesignPattern nd = new NoDesignPattern();
        nd.step1();
        nd.step2();
        nd.step3();

        // this is not possible
        // nd.step1().step2().step3();
    }
}
