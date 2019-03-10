package com.misha.hometask3;

import java.time.LocalDate;

public class HomeworkApp {

    public static void main(String[] args) {
        CarDoor car = new CarDoor(true, true);
        car.closeDoor();
        car.closeWindow();
        System.out.println(car.toString());
        System.out.println();

        CarWheel w = new CarWheel();
        w.tireWear(1);
        w.changeCarWheelOrNot();
        System.out.println();

        Car car1 = new Car("Fuel", 300, 100, 0, 6788, 123, LocalDate.now());
        car1.maxCurrentSpeed();
        car1.changeCurrentSpeed(43);
        System.out.println(car1.toString());
        System.out.println();

        car1.maxCurrentSpeed();
        car1.addOnePassenger();
        //car1.onePassengerOff();
        car1.changeCurrentSpeed(76);
        System.out.println(car1.toString());

    }

}
