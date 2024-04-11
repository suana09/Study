package com.ohgiraffers.section06.parameter;

public class RectAngle {

    private double width;
    private double height;

    public RectAngle(double width, double height) { //width, height라는 변수를 가진 객체를 생성하는 생성자
        this.width = width;
        this.height = height;
    }

    //생성자를 써서 한번에 width, height를 설정해줄 수 있다면 굳이 getter, setter를 안 써도 되는 거 아닌가??
    //그냥 둘 다 쓸 수 있다는 걸 보여주려고 하셨나봄 ㅎㅎ 안헷갈려도된당
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calcArea(){
        double area = width * height;
        System.out.println("이 사각형의 넓이는? : "+area);
    }

    public void calcRound() {
        double round = (width+height)*2;
        System.out.println("이 사각형의 둘레는? : "+round);
    } 
    
}
