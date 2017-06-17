package com.designpatterns.dependency_injection;

/**
 * Created by ryang on 17/06/2017.
 */
public class FakeHeater implements Heater {
	public FakeHeater() {
		System.out.println("Fake Heater for testing");
	}
}
