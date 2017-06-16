package com.designpatterns.oop_principle;

/**
 * Abstract classes, unlike interfaces, are classes. They are more expensive to use, because there is a look-up to do
 * when you inherit from them.
 *
 * Abstract classes look a lot like interfaces, but they have something more:
 * You can define a behavior for them. It's more about a guy saying, "these classes should look like that, and they
 * have that in common, so fill in the blanks!".
 *
 *
 * Note: Abstract class cannot be instantiated.
 *
 * use protected modifier as an interface for subclasses.
 * use public modifier as an interface to everyone else.
 *
 */
public abstract class Creature {

    protected String name;
    protected double weight;
    protected String sound;

    public abstract void setName(String name);
    public abstract String getName();

    public abstract void setWeight(double weight);
    public abstract double getWeight();

    public void sayHello() {
        System.out.println("Hello, World");
    }
}
