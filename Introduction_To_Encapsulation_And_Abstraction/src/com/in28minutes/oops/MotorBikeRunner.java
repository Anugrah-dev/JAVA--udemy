package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducatti = new MotorBike();
		MotorBike honda = new MotorBike();

		ducatti.start();
		honda.start();

		// MotorBike.speed -----> it's wrong we can't access "instance variable" from
		// the class name
		ducatti.setSpeed(100);
		System.out.println(ducatti.getSpeed());

		honda.setSpeed(90);
		System.out.println(honda.getSpeed());

	}

}
