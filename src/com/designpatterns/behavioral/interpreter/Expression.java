package com.designpatterns.behavioral.interpreter;

import java.util.Map;

/**
 * Created by ryang on 12/06/2017.
 */
public class Expression implements Operand {
    private char operation;

    public Operand left, right;

    public Expression(char operation) {
        this.operation = operation;
    }

    @Override
    public void traverse(int level) {
        left.traverse(level + 1);
        System.out.print("" + level + operation + level + " ");
        right.traverse(level + 1);
    }
    @Override
    public double evaluate(Map<String, Integer> context) {
        double result = 0;
        double a = left.evaluate(context);
        double b = right.evaluate(context);
        if (operation == '+') {
            result = a + b;
        }
        if (operation == '-') {
            result = a - b;
        }
        if (operation == '*') {
            result = a * b;
        }
        if (operation == '/') {
            result = a / b;
        }
        return result;
    }
}
