package com.designpatterns.structural.composite;

/**
 * Created by ryang on 08/06/2017.
 */
public interface Employee {

    public void add(Employee employee);
    public void remove(Employee employee);
    public Employee getChild(int i);

}
