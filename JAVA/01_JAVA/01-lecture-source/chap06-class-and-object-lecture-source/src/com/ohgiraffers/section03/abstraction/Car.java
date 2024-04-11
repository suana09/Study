package com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn; //초기에는 시동이 꺼진 false상태
    private  int speed;

    /*시동이 걸려있는 상태인 경우 할일 X, 시동이 걸려있지 않은 경우 시동을 검*/
    public void startUp(){

        if (isOn) {
            System.out.println("이미 시동이 걸린 상태입니다.");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 이제 출발 준비가 완료되었습니다.");
        }

    }

    public void acc() {
        if (isOn) {
            System.out.println("차가 앞으로 움직입니다.");
            this.speed += 10;
            System.out.println("현재 차의 시속은 "+this.speed+"km/h 입니다.");
        } else {
            System.out.println("시동이 꺼진 상태입니다. 시동을 먼저 걸어주세요.");
        }
    }

    public void stop() {
        if (isOn) {
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 차를 정지합니다.");
            } else {
                System.out.println("이미 차가 정지한 상태입니다.");
            }
        } else {
            System.out.println("시동이 꺼진 상태입니다. 시동을 먼저 걸어주세요.");
        }
    }

    public void turnOff() {
        if (isOn) {
            if (speed > 0) {
                System.out.println("주행중에는 시동을 끌 수 없습니다. 먼저 자동차를 정지해 주세요.");
            } else {
                this.isOn = false;
                System.out.println("시동을 끕니다. 다시 운행하시려면 시동을 먼저 걸어주세요.");
            }
        } else {
            System.out.println("이미 시동이 꺼진 상태입니다.");
        }
    }





}
