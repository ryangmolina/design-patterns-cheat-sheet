package com.designpatterns.structural.facade;

/**
 * Facade Class
 *
 * Facade pattern hides the complexities of the system and provides an interface to the client.
 *
 * This pattern involves a single class which provides simplified methods required by client
 * and delegates calls to methods of existing system classes.
 *
 * The facade simplifies a client’s
 * interaction with a complex system by localizing the interactions into a single interface. As
 * a result, the client can interact with a single object rather than being required to interact
 * directly in complicated ways with the objects that make up the subsystem.
 *
 * Facade pattern is more like a helper for client applications; it doesn’t hide subsystem
 * interfaces from the client. Whether to use Facade or not is completely dependent on client code
 */
public class ShapeMaker {
    private Shape square;
    private Shape rectangle;

    public ShapeMaker() {
        square = new Square();
        rectangle = new Rectangle();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
