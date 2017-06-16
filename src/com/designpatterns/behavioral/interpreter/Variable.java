package com.designpatterns.behavioral.interpreter;

import java.util.Map;

/**
 * Created by ryang on 12/06/2017.
 */
public class Variable implements Operand {
    private String name;

    public Variable(String name) {
        this.name = name;
    }
    @Override
    public void traverse(int level) {
        System.out.print(name + " ");
    }
    @Override
    public double evaluate(Map<String, Integer> context) {
        return context.get(name);
    }
}
