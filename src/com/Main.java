package com;


import java.util.concurrent.locks.ReentrantLock;

public class Main  {

public static void main(String[] args) {
    ReentrantLock lock = new ReentrantLock();
    lock.lock();
    lock.unlock();
}
}
