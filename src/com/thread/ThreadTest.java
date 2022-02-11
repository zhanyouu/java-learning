package com.thread;

public class ThreadTest {

    public static class Task implements Runnable{

        @Override
        public void run() {
            System.out.println("run");
        }
    }
    public static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("my thread");;
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.start();
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
