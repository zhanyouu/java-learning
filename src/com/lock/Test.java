package com.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

    private Lock lock = new ReentrantLock();

    public void test(){
        lock.lock();
        try{
            System.out.println(1);;
        }catch (Exception e){
            // ignored
        }finally {
            lock.unlock();
        }
    }
}
