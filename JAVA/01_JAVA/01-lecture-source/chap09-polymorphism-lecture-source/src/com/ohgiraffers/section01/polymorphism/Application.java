package com.ohgiraffers.section01.polymorphism;

public class Application {
    public static void main(String[] args) {
        /*다형성과 타입 형변환에 대해 이해할 수 있다.*/

        /*다형성이란?*/
        /*하나의 인스턴스가 여러가지 타입을 가질 수 있는 것을 의미한다.*/
        /*그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고 뭔소리고?*/
        /*하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작할 수 있다.*/

        /*다형성은 객체지향 프로그래밍의 3대 특징 (캡슐화, 상속, 다형성) 중 하나이며, */
        /*객체지향 프로그램의 꽃이라고 불리울 정도로 활용성이 높고 장점이 많다.*/
        /*그러나 학습하기 어렵다는 단점을 가지고 있다.*/


        /*다형성 장점*/
        /*1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에 유지보수성과 생산성이 증가한다.*/
        /*2. 상속을 기반으로 한 기술이기 때문에 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다.*/
        /*  이런 동일한 메세지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가지고 있다.*/
        /*  (다양한 기능을 사용하는 데 있어서 관리해야 할 메세지 종류가 줄어들게 된다.)*/
        /*  하나의 호출로 여러가지 동작을 수행할 수 있다는 측면에서 오버라이딩을 다형성이라고 보기도 한다.*/
        /*3. 확장성이 좋은 코드를 작성할 수 있다.*/
        /*4. 결합도를 낮춰서 유지보수성을 증가시킬 수 있다.*/



        /*1. Animal */
        /*2. Animal 인스턴스 생성 후 메소드 호출 확인*/
        Animal animal = new Animal(); //////animal <<이게 레퍼런스변수
        animal.eat();
        animal.run();
        animal.cry();
        System.out.println("==========================");

        /*3. Rabbit 인스턴스 생성 후 메소드 호출 확인*/
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();
        System.out.println("==========================");

        /*4. Tiger 인스턴스 생성 후 메소드 호출 확인*/
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        System.out.println("==========================");

        /*5. 부모 타입으로 자식 인스턴스 주소값 저장 */
        Animal a1 = new Rabbit(); //upcasting
        Animal a2 = new Tiger();

        //Rabbit r = new Animal(); //error
        //Tiger t = new Animal(); //error

        /*6. 동적 바인딩 확인*/
        /*동적 바인딩*/
        /*컴파일 당시에는 해당 타입의 메소드와 연결되어있다가*/
        /*런타임 당시의 실제 객체가 가진 오버라이딩된 메소드로 바인딩이 바뀌어 동작하는 것을 의미한다.*/

        a1.cry();
        a2.cry();

        //a1.jump();
        //a1.bite();

        /*7. 타입형변환*/
        System.out.println("==========================");
        ((Rabbit)a1).jump();
        ((Tiger)a2).bite();

        //((Tiger)a1).bite();
        //a1 is a reference variable of class Rabbit so cannot be cast to Tiger

        /*8. instanceof 연산자 사용 확인*/
        System.out.println("===========instanceof===========");
        System.out.println("a1이 Tiger 타입인지 확인 : "+(a1 instanceof Tiger));
        System.out.println("a1이 Rabbit 타입인지 확인 : "+(a1 instanceof Rabbit));
        System.out.println("a1이 Animal 타입인지 확인 : "+(a1 instanceof Animal));
        System.out.println("a1이 Object 타입인지 확인 : "+(a1 instanceof Object));

        //format : ((Name of reference variable) instanceof (classname))


        if (a1 instanceof Rabbit) {
            ((Rabbit)a1).jump();
        }

        if (a1 instanceof Tiger) {
            ((Tiger)a1).bite();
        }

        /*9. 클래스의 업캐스팅, 다운캐스팅*/

        /*클래스 형변환은 upcasting, downcasting으로 구분할 수 있다*/
        /*upcasting: 상위 타입으로의 형변환*/
        /*downcasting: 하위 타입으로의 형변환 */
        /*또한 작성여부에 따라 명시적과 묵시적 두가지로 구분된다.*/

        Animal animal1 = new Rabbit(); //upcasting 묵시적 형변환
        Animal animal2 = (Animal) new Rabbit(); //upcasting 명시적 형변환

        Rabbit rabbit1 = (Rabbit)animal1; //downcasting 명시적 형변환
        //Rabbit rabbit2 = animal2; //downcasting은 묵시적 형변환 불가

        /**/
        /**/




    }

}
