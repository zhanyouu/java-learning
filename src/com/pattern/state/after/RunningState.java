package com.pattern.state.after;

/**
 * 电梯运行状态类
 */
public class RunningState extends LiftState {
    // 当前状态要执行的方法
    public void run() {
        System.out.println("电梯正在运行...");
    }
    // 运行时无法开门
    @Override
    public void open() {}
    // 运行时门是关的
    @Override
    public void close() {}
    // 运行 -> 停止
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
