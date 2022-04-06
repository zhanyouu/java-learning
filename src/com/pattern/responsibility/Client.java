package com.pattern.responsibility;

public class Client {
    public static void main(String[] args) {
        // 创建一个请假条对象
        LeaveRequest leave = new LeaveRequest("小明", 3, "身体不适");
        // 创建各级领导对象
        GroupLeader groupLeader = new GroupLeader(); // 小组长
        Manager manager = new Manager(); // 部门经理
        GeneralManager generalManager = new GeneralManager(); // 总经理
        // 设置处理者链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);
        // 小明提交请假申请
        groupLeader.submit(leave);
    }
}
