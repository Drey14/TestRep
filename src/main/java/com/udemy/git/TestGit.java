package com.udemy.git;

public class TestGit {

    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        new TestGit().add(a,b);
        new TestGit().sub(a,b);
        new TestGit().mod(a,b);
    }

    void add(int a, int b) {
        System.out.println(a+b);
    }

    void sub(int a, int b) {
        System.out.println(a-b);
    }
    void mod(int a, int b) {
        System.out.println(a*b);
    }

}
