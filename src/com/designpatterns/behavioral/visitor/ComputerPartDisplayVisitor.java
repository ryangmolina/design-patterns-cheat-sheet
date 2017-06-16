package com.designpatterns.behavioral.visitor;

/**
 * Created by ryang on 14/06/2017.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
	@Override
	public void visit(Mouse mouse) {
		System.out.println("Mouse");
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Keyboard");
	}

	@Override
	public void visit(Computer computer) {
		System.out.println("Computer");
	}
}
