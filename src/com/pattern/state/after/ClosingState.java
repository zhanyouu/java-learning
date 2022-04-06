package com.pattern.state.after;

/**
 * 电梯关闭状态类
 */
public class ClosingState extends LiftState {
    // 当前状态要执行的方法
    public void close() {
        System.out.println("电梯门关闭...");
    }
    // 关闭 -> 开启
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.open();
    }
    // 关闭 -> 运行
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }
    // 关闭 -> 停止
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
