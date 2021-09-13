package com.sync;

/**
 * 除了使用关键字修饰实例方法和静态方法外，还可以使用同步代码块，在某些情况下，我们编写的方法体可能比较大，
 * 同时存在一些比较耗时的操作，而需要同步的代码又只有一小部分，如果直接对整个方法进行同步操作，可能会得不偿失，
 * 此时我们可以使用同步代码块的方式对需要同步的代码进行包裹，这样就无需对整个方法进行同步操作了，同步代码块的使用示例如下：
 */
public class AccountingSync4 implements Runnable{
    static AccountingSync4 instance=new AccountingSync4();
    static int i=0;
    @Override
    public void run() {
        //省略其他耗时操作....
        //使用同步代码块对变量i进行同步操作,锁对象为instance
        synchronized(instance){
            for(int j=0;j<1000000;j++){
                i++;
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(instance);
        Thread t2=new Thread(instance);
        t1.start();t2.start();
        t1.join();t2.join();
        System.out.println(i);
    }
}
/**
 * 从代码看出，将synchronized作用于一个给定的实例对象instance，即当前实例对象就是锁对象，
 * 每次当线程进入synchronized包裹的代码块时就会要求当前线程持有instance实例对象锁，如果当前有其他线程正持有该对象锁，
 * 那么新到的线程就必须等待，这样也就保证了每次只有一个线程执行i++;操作。当然除了instance作为对象外，
 * 我们还可以使用this对象(代表当前实例)或者当前类的class对象作为锁，如下代码：
 */
//this,当前实例对象锁
/**
 *
 */
//synchronized(this){
//        for(int j=0;j<1000000;j++){
//        i++;
//        }
//        }

//class对象锁
//synchronized(AccountingSync.class){
//        for(int j=0;j<1000000;j++){
//        i++;
//        }
//        }
