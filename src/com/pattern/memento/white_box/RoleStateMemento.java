package com.pattern.memento.white_box;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 备忘录角色类
 */
@Data
@AllArgsConstructor
public class RoleStateMemento {
    private int vit; // 生命力
    private int atk; // 攻击力
    private int def; // 防御力
}
