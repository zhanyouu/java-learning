package com.pattern.mediator;

import lombok.AllArgsConstructor;

/**
 * 抽象同事类
 */
@AllArgsConstructor
public abstract class Person {
    protected String name;
    protected Mediator mediator;
}
