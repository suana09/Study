package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {
        /*수업목표. 필드에 직접 접근시 발생하는 문제를 해결하는 방법을 이해하고 적용할 수 있다*/

        Monster monster1 = new Monster();
        monster1.setinfo("피카츄");
        monster1.setHp(200);

        Monster monster2 = new Monster();
        monster2.setinfo("파이리");
        monster2.setHp(100);

        Monster monster3 = new Monster();
        monster3.setinfo("이상해씨");
        monster3.setHp(-200);

        System.out.println("monster1.getInfo = " + monster1.getInfo());
        System.out.println("monster2.getInfo = " + monster2.getInfo());
        System.out.println("monster3.getInfo = " + monster3.getInfo());

    }
}
