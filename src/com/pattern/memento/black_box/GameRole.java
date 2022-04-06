package com.pattern.memento.black_box;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 游戏角色类(属于发起人角色)
 */
@Data
public class GameRole {
    private int vit; // 生命力
    private int atk; // 攻击力
    private int def; // 防御力
    // 初始化内部状态
    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }
    // 战斗
    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }
    // 保存角色状态功能
    public Memento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }
    // 恢复角色状态
    public void recoverState(Memento memento) {
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;
        // 将备忘录对象中存储的状态赋值给当前对象的成员
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }
    // 展示状态功能
    public void stateDisplay() {
        System.out.println("角色生命力：" + vit);
        System.out.println("角色攻击力：" + atk);
        System.out.println("角色防御力：" + def);
    }
    // 对发起者宽接口，对其他类窄接口
    @Data
    @AllArgsConstructor
    private static class RoleStateMemento implements Memento {
        private int vit; // 生命力
        private int atk; // 攻击力
        private int def; // 防御力
    }
}
