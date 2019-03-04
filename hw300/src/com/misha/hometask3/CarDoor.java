package com.misha.hometask3;

public class CarDoor {

    private boolean carDoor;
    private boolean carWindow;

    public CarDoor() {
        
    }

    public CarDoor(boolean carDoor, boolean carWindow) {
        this.carDoor = carDoor;
        this.carWindow = carWindow;
    }

    public void openDoor() {
        this.carDoor = true;
    }

    public void closeDoor() {
        this.carDoor = false;
    }

    public void openWindow() {
        this.carWindow = true;
    }

    public void closeWindow() {
        this.carWindow = false;
    }

    public boolean ifDoorIsClosedOrOpened() {
        return (this.carDoor == false) ? true : false;
    }

    public boolean ifWindowIsClosedOrOpened() {
        return (this.carWindow == false) ? true : false;
    }

    @Override
    public String toString() {
        return
                "Is the door open ? " + this.carDoor
                        + "\nIs the window open ? " + this.carWindow;
    }

}
