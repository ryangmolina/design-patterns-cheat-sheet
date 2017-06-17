package com.designpatterns.dependency_injection;

/**
 * Created by ryang on 17/06/2017.
 */
public class CoffeeMaker {
	private final Heater heater;
	private final Pump pump;


	/**
	 * With Dependency injection.
	 * We need to create a heater and a pump in order to create a coffee maker.
	 * We do this to make the code testable, we can swap the parameters with FakeHeater class or FakePump class. We can
	 * also make changes without affecting the CoffeeMaker.
	 * @param heater
	 * @param pump
	 */
	public CoffeeMaker(Heater heater, Pump pump) {
		this.heater = heater;
		this.pump = pump;
	}
}
