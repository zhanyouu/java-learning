package com.thread;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest_04 {
    public static void main(String[] args) throws Exception {
        // 两个CompletableFuture执行异步查询:
        CompletableFuture<Integer> cfQueryFromSina = CompletableFuture.supplyAsync(() -> {
            return queryCodePrice("中国石油", "https://finance.sina.com.cn/code/");
        }).whenComplete((res,ex)->{
            if(ex==null){
                System.out.println("任务的结果："+res);
            }else {
                System.out.println("发生了异常："+ex);
            }
        });
        CompletableFuture<Integer> cfQueryFrom163 = CompletableFuture.supplyAsync(() -> {
            return queryCodePrice("中国石油", "https://money.163.com/code/");
        });
        //处理前一个任务的结果
        CompletableFuture<Integer> cfQueryFromSinaRes = cfQueryFromSina.handle((res,ex)->{
            if(ex == null){
                return res +1;
            }
            return 0;
        });
        //处理前两个任务的执行结果
        CompletableFuture<Integer> combineRes = cfQueryFromSina.thenCombine(cfQueryFrom163,(x,y)->{
            return x+y;
        });
        // 主线程不要立刻结束，否则CompletableFuture默认使用的线程池会立刻关闭:
        Thread.sleep(200);
//        System.out.println(cfQueryFromSinaRes.get());
//        System.out.println(cfQueryFromSina.get());
        System.out.println(combineRes.get());
    }

    static Integer queryCodePrice(String name, String url) {
        System.out.println("query code from " + url + "...");
        try {
            Thread.sleep((long) (Math.random() * 100));
        } catch (InterruptedException e) {
        }
//        throw new RuntimeException();
        return 10;
    }
}
