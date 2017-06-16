package com.designpatterns.behavioral.state;

/**
 * Created by ryang on 12/06/2017.
 */
public class CeilingFanPullChain {
    private State currentState;

    public CeilingFanPullChain() {
        currentState = new Off();
    }

    public void set_state(State s) {
        currentState = s;
    }

    public void pull() {
        currentState.pull(this);
    }
}
