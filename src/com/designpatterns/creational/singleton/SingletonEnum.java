package com.designpatterns.creational.singleton;

/**
 * Joshua Bloch suggest the use of Enum to implement Singleton as Java ensures that any enum value is
 * instantiated only once in a Java program. The drawback is that enum type is somewhat inflexible.
 */
public enum SingletonEnum {
    INSTANCE
}
