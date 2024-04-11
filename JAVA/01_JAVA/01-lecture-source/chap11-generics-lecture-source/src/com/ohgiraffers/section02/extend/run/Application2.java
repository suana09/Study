package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application2 {
    public static void main(String[] args) {

        /*와일드 카드에 대해 이해할 수 있다.*/

        /*와일드카드 (WildCard)*/
        /*제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때, */
        /*그 객체의 타입 변수를 제한할 수 있다.*/
        /* <?> : 제한 없음*/
        /* <? extends Type> : 와일드카드의 상한 제한 (Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용 가능)*/
        /* <? super Type> : 와일드카드의 하한 제한 (type과 type의 부모를 이용해 생성한 인스턴스만 인자로 사용 가능)*/


        WildCardFarm wildCardFarm = new WildCardFarm();

        //wildCardFarm.anyType(new RabbitFarm<Mammal>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        //type이 <Rabbit> 이고 (new Rabbit()) : Rabbit의 인스턴스를 매개변수로 전달받은 RabbitFarm
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        System.out.println("==================================================");


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
