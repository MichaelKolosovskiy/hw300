package com.misha.hometask3;

public class CarWheel {

    private double amountOfTheWheel;

    public CarWheel() {
        this.amountOfTheWheel = Math.random();
    }

    public CarWheel(double amountOfTheWheel) {
        if (amountOfTheWheel >= 1) {
            this.amountOfTheWheel = 1;
        } else if (amountOfTheWheel < 0) {
            this.amountOfTheWheel = 0;
        } else {
            this.amountOfTheWheel = amountOfTheWheel;
        }
    }

    public void tireWear(int percent) {
        if (percent > 100) {
            percent = 100;
        }
        if (percent < 0) {
            this.amountOfTheWheel = 0;
        } else {
            this.amountOfTheWheel = amountOfTheWheel - (0.01 * percent);
        }
    }

    public double getStateOfTheWheel() {
        return this.amountOfTheWheel;
    }

    public boolean changeCarWheelOrNot() {
        if (this.amountOfTheWheel >= 0 && this.amountOfTheWheel <= 0.30 || this.amountOfTheWheel < 0) {
            return true;
        } else {
            return false;
        }
    }
}

