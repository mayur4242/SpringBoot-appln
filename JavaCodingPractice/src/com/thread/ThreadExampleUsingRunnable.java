package com.thread;

public class ThreadExampleUsingRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running using Runnable interface.");
    }

    public static void main(String[] args) {
        ThreadExampleUsingRunnable runnableInstance = new ThreadExampleUsingRunnable();
        Thread thread = new Thread(runnableInstance);
        thread.start();
    }
}
