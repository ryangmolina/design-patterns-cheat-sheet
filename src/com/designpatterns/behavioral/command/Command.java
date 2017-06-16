package com.designpatterns.behavioral.command;

/**
 * Encapsulate a request as an object, thereby letting you parametrize clients with different requests,
 * queue or log requests, and support undoable operations.
 *
 * Need to issue requests to objects without knowing anything about the operation being requested or
 * the receiver of the request.
 *
 * All clients of Command objects treat each object as a "black box" by simply invoking the object's
 * virtual execute() method whenever the client requires the object's "service".
 */
public interface Command {
    void execute();
}
