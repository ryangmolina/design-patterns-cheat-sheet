package com.designpatterns.behavioral.state;

/**
 * Created by ryang on 12/06/2017.
 */
public class Off implements State {
    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.set_state(new Low());
        System.out.println("low speed");
    }
}
