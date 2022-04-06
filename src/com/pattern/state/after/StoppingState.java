package com.pattern.state.after;

/**
 * 电梯停止状态类
 */
public class StoppingState extends LiftState {
    // 当前状态要执行的方法
    public void stop() {
        System.out.println("电梯停止了...");
    }
    // 停止 -> 开门（委托给ClosingState子类执行）
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.getLiftState().open();
    }
    // 停止 -> 关门（委托给ClosingState子类执行）
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.getLiftState().close();
    }
    // 停止 -> 运行（委托给ClosingState子类执行）
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().run();
    }
}
