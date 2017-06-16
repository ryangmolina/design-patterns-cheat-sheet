package com.designpatterns.behavioral.visitor;

/**
 * Created by ryang on 14/06/2017.
 */
public class Mouse implements ComputerPart {
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}
