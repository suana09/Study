package com.ohgiraffers.section06.staticKeyword;

public class Application {
    public static void main(String[] args) {

        /*static keyword에 대해 이해할 수 있다.*/

        /*static*/
        /*정적 메모리 영역에 프로그램이 start 될 때 할당하는 키워드.*/
        /*인스턴스를 생성하지 않고도 사용할 클래스의 멤버 (필드, 메소드) 지정 가능 */
        /*하지만 static keyword의 남발은 유지보수와 추적이 힘든 코드를 작성하는 것이기 때문에 피하는 것이 좋다.*/
        /*명확한 목적이 존재하지 않는 이상 static 키워드 사용은 자제하자*/
        /*의도적으로 static keyword를 사용하는 대표적인 예는 singleton 객체를 생성할 때이다.*/
        /**/

        /*1. static 키워드를 필드에 사용*/
        StaticFieldTest sft = new StaticFieldTest();

        System.out.println("sft.getNonstaticCount() = " + sft.getNonstaticCount()); //0
        System.out.println("sft.getStaticCount() = " + sft.getStaticCount()); //0

        sft.increaseNonStaticCount();
        sft.increaseStaticCount();

        System.out.println("sft.getNonstaticCount() = " + sft.getNonstaticCount()); //1
        System.out.println("sft.getStaticCount() = " + sft.getStaticCount()); //1

        StaticFieldTest sft2 = new StaticFieldTest();

        System.out.println("sft2.getNonstaticCount() = " + sft2.getNonstaticCount()); //0
        System.out.println("sft2.getStaticCount() = " + sft2.getStaticCount()); //1

        /*인스턴스 변수 (non-static field)의 경우 sft와 sft2 두 개의 인스턴스가 서로의 값을 공유하지 못하고*/
        /*새 인스턴스를 생성하여 필드를 출력하면 0으로 초기화된 것을 확인할 수 있다.*/

        /*그러나 static field의 경우 프로그램이 종료할 때까지 유지되기 때문에*/
        /*인스턴스가 새로 생성되어도 값을 공유한다.*/
        /*여러개의 인스턴스가 같은 공간 (field) 을 공유하는 것.*/


        /*2. static 키워드를 메소드에 사용*/

        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();
        //smt.staticMethod();//가능은 하나 자바에서 권장하지 않는 방식.
        //static method의 장점이 인스턴스를 생성하지 않고 메소드를 사용할 수 있다는 거니까 비효율적임
        StaticMethodTest.staticMethod();

        /**/
        /**/
        /**/
        /**/
        /**/
    }
}
