package com.designpatterns.behavioral.mediator;

import java.util.Date;

/**
 * Mediator pattern is used to reduce communication complexity between multiple objects or classes.
 * This pattern provides a mediator class which normally handles all the communications
 * between different classes and supports easy maintenance of the code by loose coupling.
 */
public class ChatRoom {
	public void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName() + "] ");
	}
}
