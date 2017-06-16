package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryang on 08/06/2017.
 */
public class Manager implements Employee {

    List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employeeList.get(i);
    }
}
