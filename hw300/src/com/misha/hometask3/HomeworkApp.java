package com.misha.hometask3;

import java.time.LocalDate;

public class HomeworkApp {

    public static void main(String[] args) {
        CarDoor car = new CarDoor();
        car.closeDoor();
        car.ifDoorIsClosedOrOpened();
        car.closeWindow();
        car.ifWindowIsClosedOrOpened();
        System.out.println(car.toString());
        System.out.println();

        CarWheel w = new CarWheel(31);
        w.tireWear(30);
        System.out.println("Do I need to change tires? - " + w.changeCarWheelOrNot());
        System.out.println();

        Car car1 = new Car("Fuel", 300, 100, 4, 4, 123, LocalDate.now());
        car1.maxCurrentSpeed();
        car1.changeCurrentSpeed(43);
        System.out.println(car1.toString());
        System.out.println();

        car1.maxCurrentSpeed();
        car1.addOnePassenger();
        car1.changeCurrentSpeed(76);
        System.out.println(car1.toString());

    }

}
