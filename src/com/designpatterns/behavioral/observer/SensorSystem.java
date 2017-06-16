package com.designpatterns.behavioral.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by ryang on 12/06/2017.
 */
public class SensorSystem {
    private Vector listeners = new Vector();

    public void register(AlarmListener alarmListener) {
        listeners.addElement(alarmListener);
    }

    public void soundTheAlarm() {
        for (Enumeration e = listeners.elements(); e.hasMoreElements();) {
            ((AlarmListener) e.nextElement()).alarm();
        }
    }
}
