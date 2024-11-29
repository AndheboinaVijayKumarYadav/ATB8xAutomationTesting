package com.vijay.testing.sampleCheck;

public class BuildDesignPattern {
    public BuildDesignPattern step1() {
        System.out.println("Step 1 is started");
        System.out.println("Step 1 is done");
        return this;
    }

    public BuildDesignPattern step2() {
        System.out.println("Step 2 is started");
        System.out.println("Step 2 is done");
        return this;
    }

    public BuildDesignPattern step3(String name) {
        System.out.println("Step 2 is started");
        System.out.println("Step 2 is done -> " + name);
        return this;
    }

    public static void main(String[] args) {
        BuildDesignPattern bp = new BuildDesignPattern();
        bp.step1().step2().step3("Pramod");
    }
}
