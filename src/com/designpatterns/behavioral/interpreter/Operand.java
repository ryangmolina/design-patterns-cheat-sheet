package com.designpatterns.behavioral.interpreter;

import java.util.Map;

/**
 * Created by ryang on 12/06/2017.
 */
public interface Operand {
    double evaluate(Map<String, Integer> context);
    void traverse(int level);
}
