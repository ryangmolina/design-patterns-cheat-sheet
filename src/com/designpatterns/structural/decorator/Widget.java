package com.designpatterns.structural.decorator;

/**
 * Attach additional responsibilities to an object dynamically. Decorators provide a
 * flexible alternative to subclassing for extending functionality.
 *
 *
 * Create a "lowest common denominator" that makes classes interchangeable
 * Create a second level base class for optional functionality
 * "Core" class and "Decorator" class declare an "isa" relationship
 * Decorator class "has a" instance of the "lowest common denominator"
 * Decorator class delegates to the "has a" object
 * Create a Decorator derived class for each optional embellishment
 * Decorator derived classes delegate to base class AND add extra stuff
 * Client has the responsibility to compose desired configurations
 */
public interface Widget {
    void draw();
}
