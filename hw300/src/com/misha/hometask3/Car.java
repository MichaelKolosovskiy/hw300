package com.misha.hometask3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Car {

    private final LocalDate year;
    private String engineType;
    private int maxSpeed;
    private int acceleration;
    private int passengers;
    private int passengersIn;
    private int currentSpeed;
    private int currentMaxSpeed;
    private ArrayList<CarWheel> carWheels = new ArrayList<>();
    private ArrayList<CarDoor> carDoors = new ArrayList<>();

    public Car(LocalDate year) {
        this.year = year;
        addDoors(4);
        addWheels(4);
    }

    public Car(String engineType, int maxSpeed, int acceleration, int passengers, int passengersIn, int currentSpeed, LocalDate year) {
        this(year);
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.passengersIn = passengersIn;
        this.passengers = passengers;
        this.currentSpeed = currentSpeed;

        if (this.passengersIn >= this.passengers) {
            this.passengersIn = this.passengers;
        }
        if (this.passengers <= 0) {
            this.passengers = 1;
        }

        addDoors(4);
        addWheels(4);

    }

    public void addWheels(int wheelsScore) {
        for (int i = 0; i < wheelsScore; i++) {
            carWheels.add(new CarWheel());
        }
    }

    public void addDoors(int doorsScore) {
        for (int i = 0; i < doorsScore; i++) {
            carDoors.add(new CarDoor());
        }
    }

    public int maxCurrentSpeed() {
        for (int i = 0; i < carWheels.size(); i++) {
            double worseWheel = 1;
            if (worseWheel >= carWheels.get(i).getStateOfTheWheel()) {
                worseWheel = carWheels.get(i).getStateOfTheWheel();
            }
            this.currentMaxSpeed = (int) (maxSpeed * worseWheel);
        }
        return this.currentMaxSpeed;
    }

    public void getOffAllPassengers() {
        this.passengersIn = 0;
        this.currentSpeed = 0;
        this.currentMaxSpeed = 0;
    }

    public void addOnePassenger() {
        if (this.passengersIn >= this.passengers) {
            this.passengersIn = this.passengers;
        }
        if (this.passengersIn >= 0 && this.passengersIn < this.passengers) {
            this.passengersIn += 1;
        }
        if (this.passengersIn < 0) {
            this.passengersIn = 1;
        }
    }

    public void changeCurrentSpeed(int currentSpeed) {
        if (this.passengersIn >= 1 && currentSpeed > this.currentMaxSpeed) {
            this.currentSpeed = this.currentMaxSpeed;
        }
        if (this.passengersIn >= 1 && currentSpeed <= 0) {
            this.currentSpeed = 0;
        }
        if (this.passengersIn >= 1 && (currentSpeed >= 1 && currentSpeed <= this.currentMaxSpeed)) {
            this.currentSpeed = currentSpeed;
        } else {
            if (this.passengersIn <= 0) {
                getOffAllPassengers();
            }
        }
    }

    public void onePassengerOff() {
        this.passengersIn--;
        if (this.passengersIn == 0) {
            getOffAllPassengers();
        }
    }

    public CarWheel getWheelIndex(int index) {
        if (index <= carWheels.size() && index >= 0) {
            return carWheels.get(index);
        } else {
            return null;
        }
    }

    public CarDoor getDoorIndex(int index) {
        if (index <= carDoors.size() && index >= 0) {
            return carDoors.get(index);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return
                "Year : " + this.year
                        + "\nEngine: " + this.engineType
                        + "\nSpeed: " + this.maxSpeed
                        + "\nAcceleration: " + this.acceleration
                        + "\nPassenger: " + this.passengers
                        + "\nPassenger in the car: " + this.passengersIn
                        + "\nCurrent speed: " + this.currentSpeed
                        + "\nCurrent max speed: " + this.currentMaxSpeed;
    }
}
