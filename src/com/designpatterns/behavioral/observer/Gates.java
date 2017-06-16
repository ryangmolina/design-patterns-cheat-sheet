package com.designpatterns.behavioral.observer;

import java.awt.event.ActionListener;

/**
 * Created by ryang on 12/06/2017.
 */
public class Gates implements AlarmListener{
    public void alarm() {
        System.out.println("gates close");
    }
}
