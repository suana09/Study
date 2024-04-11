package com.ohgiraffers.section02.encapsulation.problem4;
import java.lang.Math;

public class Application {
    public static void main(String[] args) {

        /*1. private variable 에 직접 접근 시도: 에러 발생 확인*/
        Monster monster1 = new Monster();
        //monster1.kinds //error occured, cannot use bc 'kinds' is private variable in other class



        /*2. public 메소드를 활용하여 private variable에 간접 접근*/
        monster1.setKinds("피카츄");
        monster1.setHp(200);

        System.out.println("monster1.getinfo() = " + monster1.getinfo());

        //problem 2~3에서와는 다르게 Class monster의 변수명 name, hp, kinds .. 를 다른 이름으로 바꾸어도 오류가 나지 않는다
        //변수에 직접 접근하지 않고 public method로 접근하였기 때문이다


        /*캡슐화는 유지보수성을 증가시키기 위해 직접 접근을 제한,*/
        /*public method를 사용하여 간접적으로 접근하여 사용할 수 있도록 만드는 것이다.*/
        /*클래스 작성 시 특별한 목적이 아닌 이상 캡슐화하는 것을 기본 원칙으로 한다.*/
        //


    }


}
