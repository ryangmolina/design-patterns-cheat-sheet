package com.designpatterns.dependency_injection;

/**
 * Created by ryang on 17/06/2017.
 */
public class Thermosiphon implements Pump {

	private final Heater heater;

	public Thermosiphon (Heater heater) {
		this.heater = heater;
	}
}
