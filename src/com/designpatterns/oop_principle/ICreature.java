package com.designpatterns.oop_principle;

/**
 * We can think of the interface as a contract. That the implementing class must follow.
 *
 * Implementing an interface consumes very little CPU, because it's not a class, just a bunch of names, and therefore
 * there isn't any expensive look-up to do.
 */
public interface ICreature {

    // All variables inside interface are constant.
    int CONSTANT = 10;

    /**
     * All methods are public abstract.
     */
    public void setName(String name);
    public String getName();

    public void setWeight(double weight);
    public double getWeight();
}
