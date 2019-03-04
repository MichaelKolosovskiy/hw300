package com.misha.hometask3;

public class CarWheel {

    private double amountOfTheWheel;

    public CarWheel() {
        this.amountOfTheWheel = Math.random();
    }

    public CarWheel(double amountOfTheWheel) {
        this.amountOfTheWheel = amountOfTheWheel;
    }

    public void tireWear(int percent) {
        this.amountOfTheWheel = amountOfTheWheel - (0.01 * percent);
    }

    public double getStateOfTheWheel() {
        return this.amountOfTheWheel;
    }

    public void changeCarWheelOrNot() {
        if (this.amountOfTheWheel >= 0 && this.amountOfTheWheel <= 0.30) {
            System.out.println("You need to change your wheels");
        } else {
            System.out.println("You don't need to change your wheels");
        }
    }
}
