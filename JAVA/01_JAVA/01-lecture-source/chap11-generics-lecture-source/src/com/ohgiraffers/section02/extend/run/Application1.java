package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {
    public static void main(String[] args) {
        /*extends 키워드를 이용하여 특정한 타입만을 사용하도록 제네릭 범위를 제한할 수 있다.*/

        //RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
        //Type parameter 'com.ohgiraffers.section02.extend.Animal' is not within its bound;
        //should implement 'com.ohgiraffers.section02.extend.Rabbit'
        //bcuz we declared RabbitFarm class as <T extends Rabbit>

        //RabbitFarm<Mammal> farm1 = new RabbitFarm<Mammal>();

        //RabbitFarm<Snake> farm1 = new RabbitFarm<Snake>();

        //T 는 Rabbit이거나 Rabbit을 상속받은 (Rabbit 클래스의 후손인) 타입만 가능
        RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();

        //farm1.setAnimal(new Snake());

        farm1.setAnimal(new Rabbit());
        ((Rabbit) farm1.getAnimal()).cry();
        farm1.getAnimal().cry();//형변환 생략가능
        //왜 형변환을 해야된다는거지 근ㄷㅔ
        //아 RabbitFarm으로 만들었는데 Rabbit의 메소드를 쓸거라서..? 근데 상속관계면 형변환 안해도되잖아 왜지

        farm2.setAnimal(new Bunny());
        farm2.getAnimal().cry();

        farm3.setAnimal(new DrunkenBunny());
        farm3.getAnimal().cry();

        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
    }
}
