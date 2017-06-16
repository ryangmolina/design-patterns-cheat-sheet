package com.designpatterns.behavioral.memento;

/**
 * Memento pattern is used to restore state of an object to a previous state.
 *
 * Memento contains state of an object to be restored.
 * Originator creates and stores states in Memento objects.
 * Caretaker object is responsible to restore object state from Memento.
 *
 * Promote undo or rollback to full object status.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
