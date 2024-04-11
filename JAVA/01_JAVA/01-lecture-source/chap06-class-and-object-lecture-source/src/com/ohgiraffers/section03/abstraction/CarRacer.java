package com.ohgiraffers.section03.abstraction;

public class CarRacer {
    private Car car = new Car();//Car class 객체생성

    public void startUp() {
        car.startUp();
    }

    public void stepAccelerator() {
        car.acc();
    }

    public void stepBreak() {
        car.stop();
    }

    public void turnOff() {
        car.turnOff();
    }




}
