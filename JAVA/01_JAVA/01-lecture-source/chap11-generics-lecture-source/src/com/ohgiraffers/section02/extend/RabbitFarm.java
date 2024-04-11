package com.ohgiraffers.section02.extend;

//public class RabbitFarm <T implements Animal>{} //error
//public class RabbitFarm <T extends Animal>{} //uses extends keyword
//public class RabbitFarm <T extends Rabbit>{}
//public class RabbitFarm <T extends Rabbit & Animal>{} //클래스와 인터페이스 상속

public class RabbitFarm<T extends Rabbit> {
    //<> 안의 타입을 클래스 혹은 인터페이스에 상속시킬 때,
    //원래라면 인터페이스의 상속은 implements 키워드를 사용해야 하지만
    //generic 은 extends 키워드를 사용하여 상속해야 한다

    //타입 변수가 어떤 타입이 될지는 모르겠지만 Rabbit 이거나 Rabbit 을 상속받은 타입이다 라는뜻 ...
    private T animal;

    public RabbitFarm(){

    }
    public RabbitFarm(T rabbit) {
        this.animal = rabbit;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}





