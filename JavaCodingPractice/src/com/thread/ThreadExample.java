package com.thread;

public class ThreadExample extends Thread {


    public ThreadExample(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        ThreadExample th = new ThreadExample("First Thread");
        th.start();
       // th.start();
    }
}
