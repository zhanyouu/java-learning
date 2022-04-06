package com.pattern.memento.white_box;

import lombok.Data;

/**
 * 备忘录对象管理角色
 */
@Data
public class RoleStateCaretaker {
    private RoleStateMemento roleStateMemento;
}