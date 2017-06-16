package com.designpatterns.behavioral.strategy;

/**
 * Define a family of algorithms, encapsulate each one, and make them interchangeable.
 * Strategy lets the algorithm vary independently from the clients that use it.
 *
 * Capture the abstraction in an interface, bury implementation details in derived classes.
 *
 * Interchanging FOO and BAR.
 *
 *
 * A more popular characterization of this "abstract coupling" principle is
 * "Program to an interface, not an implementation".
 *
 * Modes of transportation to an airport is an example of a Strategy. Several options exist such
 * as driving one's own car, taking a taxi, an airport shuttle, a city bus, or a limousine service.
 * For some airports, subways and helicopters are also available as a mode of transportation to the airport.
 * Any of these modes of transportation will get a traveler to the airport, and they can be used interchangeably.
 * The traveler must chose the Strategy based on trade-offs between cost, convenience, and time.
 */
public interface Strategy {
    void solve();
}
