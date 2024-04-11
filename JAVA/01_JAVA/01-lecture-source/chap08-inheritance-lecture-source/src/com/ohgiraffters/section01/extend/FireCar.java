package com.ohgiraffters.section01.extend;

public class FireCar extends Car{
    
    public FireCar(){
        super();
        System.out.println("firecar 기본생성자 호출됨...");
    }

    @Override
    public void soundHorn() {
        if (isRunning()) {
            System.out.println("빠아아아아아앙뿌와아아아아아아앙삐용삐용삐용");
        } else {
            System.out.println("소방차 가는중.. 앞에 다들 비켜라");
        }
    }

    @Override
    protected boolean isRunning() {
        return super.isRunning();
    }


    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다 물을 뿌립니다================");


    }


}
