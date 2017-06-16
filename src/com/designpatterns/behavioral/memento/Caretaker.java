package com.designpatterns.behavioral.memento;

import java.util.ArrayList;

/**
 * Created by ryang on 12/06/2017.
 */
public class Caretaker {
    private ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento m) {
        mementos.add(m);
    }

    public Memento getMemento(int i) {
        return mementos.get(i);
    }
}
