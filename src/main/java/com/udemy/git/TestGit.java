package com.udemy.git;

public class TestGit {

    public static void main(String[] args) {
        int a = 100;
        int b = 2;

        new TestGit().add(a,b);
        new TestGit().sub(a,b);
        new TestGit().mod(a,b);
        new TestGit().del(a, b);
        new TestGit().exp(a);
        new TestGit().del2(a);
    }

    void add(int a, int b) {
        System.out.println(a+b);
    }

    void sub(int a, int b) {
        System.out.println(a - b);
    }

    void mod(int a, int b) {
        System.out.println(a * b);
    }

    void del(int a, int b) {
        System.out.println(a / b);
    }

    void exp(int a) {
        System.out.println(a * a);
    }

    void del2(int a) {
        System.out.println(a / 2);
    }


}
