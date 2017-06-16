package com.designpatterns.behavioral.visitor;

/**
 * Visitor implements "double dispatch". OO messages routinely manifest "single dispatch" -
 * the operation that is executed depends on: the name of the request, and the type of the receiver.
 * In "double dispatch", the operation executed depends on: the name of the request,
 * and the type of TWO receivers (the type of the Visitor and the type of the element it visits).
 */
public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
