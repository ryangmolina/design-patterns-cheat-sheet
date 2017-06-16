package com.designpatterns.behavioral.templatemethod;

/**
 * Created by ryang on 12/06/2017.
 */
public class Realization extends Specialization {
    // 4. Derived classes can override placeholder methods
    protected void stepTwo() {
        System.out.println("Realization.stepTwo");
    }

    protected void step3_2() {
        System.out.println( "Realization.step3_2");
    }

    // 5. Derived classes can override implemented methods
    // 6. Derived classes can override and "call back to" base class methods
    protected void stepFor() {
        super.stepFor();
        System.out.println("Realization.stepFor");
    }
}
