package com.designpatterns.behavioral.state;

/**
 * Created by ryang on 12/06/2017.
 */
public class Medium implements State {
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.set_state(new High());
        System.out.println("high speed");
    }
}
