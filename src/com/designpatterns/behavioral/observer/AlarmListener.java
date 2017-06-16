package com.designpatterns.behavioral.observer;

/**
 * Define a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are notified and updated automatically.
 *
 * Encapsulate the core (or common or engine) components in a Subject abstraction,
 * and the variable (or optional or user interface) components in an Observer hierarchy.
 *
 * The "View" part of Model-View-Controller.
 *
 *
 * SensorSystem is the "subject".  Lighting, Gates, and Surveillance are the "views".
 * The subject is only coupled to the "abstraction" of AlarmListener.
 *
 */
public interface AlarmListener {
    void alarm();
}
