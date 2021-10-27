package com.thread;
import java.util.concurrent.*;

public class ThreadPoolTest {
    public static class Task implements Runnable{
        private int i = 0;

        public Task(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println("线程"+Thread.currentThread().getName()+"执行第"+i+"个任务");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newCachedThreadPool();//很快，没有核心线程数，都是临时线程（无数个），阻塞队列
//        ExecutorService executorService = Executors.newFixedThreadPool(10);//慢，10个核心线程数，无界队列（线程进入队列等待），每10个线程一个轮训执行
//        ExecutorService executorService = Executors.newSingleThreadExecutor();//很慢，1个核心线程,无界队列（线程进入队列等待）
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 0, TimeUnit.MILLISECONDS
                , new LinkedBlockingQueue<>(10));
        for (int i = 1;i<=100;i++){
            threadPoolExecutor.execute(new Task(i));
        }
    }
}
/**
 *多线程线程池任务提交优先级：
 * private final HashSet<Worker> workers = new HashSet<Worker>();
 * Worker: 实现了Runnable接口，本质是线程、里面有两个成员变量Thread和Runnable
 *
 * 1、        if (workerCountOf(c) < corePoolSize) {
 *                  if (addWorker(command, true))
 *                      return;
 *               }
 * 如果运行的线程数小于核心线程数，往workers里面添加当前任务（指明是核心线程）
 * 2、        if (isRunning(c) && workQueue.offer(command)) {
 *                       if (addWorker(command, true))
 *                      return;
 *               }
 * 如果工作队列能够存放任务，就塞入工作队列
 * 3、        else if (!addWorker(command, false))
 * 最后以临时线程往workers里面添加任务，如果能成功，则添加；否则执行拒绝策略
 *             reject(command);
 *
 *  线程池是如何实现线程复用的。
 *  while (task != null || (task = getTask()) != null) {
 *      task.run();
 *  }
 *  当前线程执行任务是一个while循环，如果当前线程执行结束，发现工作队列还有任务，会从工作队列获取任务继续执行。直到工作队列无线程可执行
 */