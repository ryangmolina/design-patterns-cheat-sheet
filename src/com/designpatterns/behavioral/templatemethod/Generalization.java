package com.designpatterns.behavioral.templatemethod;

/**
 * Frameworks (large scale reuse infrastructures) use Template Method a lot.
 * All reusable code is defined in the framework's base classes, and then clients of the framework are free
 * to define customizations by creating derived classes as needed.
 */
public abstract class Generalization {
    // 1. Standardize the skeleton of an algorithm in a "template" method
    public void findSolution() {
        stepOne();
        stepTwo();
        stepThr();
        stepFor();
    }
    // 2. Common implementations of individual steps are defined in base class
    private void stepOne() {
        System.out.println("Generalization.stepOne");
    }
    // 3. Steps requiring peculiar implementations are "placeholders" in the base class
    abstract void stepTwo();
    abstract void stepThr();

    void stepFor() {
        System.out.println( "Generalization.stepFor" );
    }
}
