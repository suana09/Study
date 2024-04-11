package com.ohgiraffers.section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {
        /*다형성을 적용하여 객체 배열을 만들어 인스턴스를 연속처리 할 수 있다*/

        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        /*Animal 클래스가 가지는 메소드를 오버라이딩한 메소드를 호출시 동적 바인딩을 이용할 수 있다.*/

        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Rabbit) {
                ((Rabbit)animals[i]).jump(); //animals는 Animal 의 참조변수. (Rabbit)으로 downcasting

            } else if (animals[i] instanceof Tiger) {
                ((Tiger) animals[i]).bite();
            } else {
                System.out.println("토끼 혹은 호랑이가 아닙니다.");
            }
        }




        /**/
        /**/
        /**/
        /**/
        /**/

    }
}
