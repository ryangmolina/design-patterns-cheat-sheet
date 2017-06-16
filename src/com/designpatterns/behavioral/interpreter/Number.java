package com.designpatterns.behavioral.interpreter;

import java.util.Map;

/**
 * Created by ryang on 12/06/2017.
 */
public class Number implements Operand {
    private double value;

    public Number(double value) {
        this.value = value;
    }
    @Override
    public void traverse(int level) {
        System.out.print(value + " ");
    }
    @Override
    public double evaluate(Map context) {
        return value;
    }
}
