package com.in28minutes.oops;

public class MotorBike {

	// State
	private int speed;

	void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	int getSpeed() {
		return this.speed;
	}

	public void increaseSpeed(int incSpeedBy) {
		this.speed += incSpeedBy;
	}

	public void decreaseSpeed(int decSpeedBy) {
		if (decSpeedBy < this.speed) {
		this.speed -= decSpeedBy;
		} else {
			System.out.println("the speed you want to achive is not possible please enter a valid speed")
		}
		
	}

	void start() {
		System.out.println("Bike is starting........");
	}
}
