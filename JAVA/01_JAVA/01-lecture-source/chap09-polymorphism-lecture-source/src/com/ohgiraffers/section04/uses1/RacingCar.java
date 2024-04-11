package com.ohgiraffers.section04.uses1;

public class RacingCar extends Car implements Soundable {
    @Override
    public void go() {
        System.out.println("레이싱카가 달려갑니다.");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 정지합니다.");
    }

    @Override
    public void horn() {
        System.out.println("부아아아아아앙부와아아아앙우와아아아아아앙");
    }
}
