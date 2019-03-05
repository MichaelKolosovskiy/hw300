package com.misha.hometask3;

public class CarDoor {

    private boolean stateOfCarDoor;
    private boolean stateOfCarWindow;

    public CarDoor() {

    }

    public CarDoor(boolean stateOfCarDoor, boolean stateOfCarWindow) {
        this.stateOfCarDoor = stateOfCarDoor;
        this.stateOfCarWindow = stateOfCarWindow;
    }

    public void openDoor() {
        this.stateOfCarDoor = true;
    }

    public void closeDoor() {
        this.stateOfCarDoor = false;
    }

    public void openWindow() {
        this.stateOfCarWindow = true;
    }

    public void closeWindow() {
        this.stateOfCarWindow = false;
    }

    public boolean ifDoorIsClosedOrOpened() {
        return this.stateOfCarDoor = (!this.stateOfCarDoor) ? true : false;
    }

    public boolean ifWindowIsClosedOrOpened() {
        return this.stateOfCarWindow = (!this.stateOfCarWindow) ? true : false;
    }

    @Override
    public String toString() {
        return
                "Is the door open ? " + this.stateOfCarDoor
                        + "\nIs the window open ? " + this.stateOfCarWindow;
    }

}
