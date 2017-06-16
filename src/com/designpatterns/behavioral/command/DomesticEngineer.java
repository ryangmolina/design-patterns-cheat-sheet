package com.designpatterns.behavioral.command;

/**
 * Created by ryang on 12/06/2017.
 */
public class DomesticEngineer implements Command {
    @Override
    public void execute() {
        System.out.println("DomesticEngineer");
    }
}
