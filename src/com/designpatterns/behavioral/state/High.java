package com.designpatterns.behavioral.state;

/**
 * Created by ryang on 12/06/2017.
 */
public class High implements State {
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.set_state(new Off());
        System.out.println("turning off");
    }
}
