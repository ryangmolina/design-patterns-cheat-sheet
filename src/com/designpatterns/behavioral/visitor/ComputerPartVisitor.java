package com.designpatterns.behavioral.visitor;

/**
 * Created by ryang on 14/06/2017.
 */
public interface ComputerPartVisitor {
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Computer computer);
}
