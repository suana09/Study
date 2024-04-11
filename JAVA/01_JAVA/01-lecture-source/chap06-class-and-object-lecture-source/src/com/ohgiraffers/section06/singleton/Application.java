package com.ohgiraffers.section06.singleton;

public class Application {
    public static void main(String[] args) {

        /*싱글톤 패턴에 대해 이해하고 이를 구현할 수 있다.*/

        /*singleton-pattern 이란?*/
        /*어플리케이션이 시작될 때 어떤 클래스가 최초 한 번만 메모리를 할당하고 그 메모리에 인스턴스를 만들어*/
        /*하나의 인스턴르를 공유해서 사용하며 메모리 낭비를 방지할 수 있게 함. (매번 인스턴스 생성 X)*/
        /*장점*/
        /*1. 첫 번째 이용 시에는 인스턴스를 생성해야하므로 속도 차이가 나지 않지만*/
        /*  두 번째 이용부터는 인스턴스 생성 시간 없이 사용할 수 있다.*/
        /*2. 인스턴스가 절대적으로 한 개만 존재하는 것을 보증할 수 있다.*/
        /*단점*/
        /*1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다. (유지보수와 테스트 문제)*/
        /*2. 동시성 문제를 고려해서 설계해야하기 때문에 난이도가 있다.*/

        /*싱글톤 구현 방법*/
        /*1. 이른 초기화 (eager initialization)*/
        /*2. 게으른 초기화 (lazy initialization)*/
        
        
        /*1. 이른 초기화*/

        //EagerSingleton eager = new EagerSingleton(); //EagerSingleton has private access

        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        System.out.println("eager1.hashCode() = " + eager1.hashCode());
        System.out.println("eager2.hashCode() = " + eager2.hashCode());
        //same with eager1
        //WHY? : eager1와 eager2에 동일한 인스턴스 (EagerSingleton 클래스 에서 생성한 인스턴스 eager) 을 담은(얕은복사 한) 것이기 때문에

        
        /*2. 게으른 초기화*/
        
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println("lazy1.hashCode() = " + lazy1.hashCode());
        System.out.println("lazy2.hashCode() = " + lazy2.hashCode());



        /*이른 초기화를 사용하면 클래스 자체를 로드하는 속도가 느려지지만*/
        /*>> (클래스를 로드하는 동시에 인스턴스를 생성해야 하기 때문)*/
        /*처음 인스턴스 반환 요청에서 속도가 빠르다는 장점을 가진다.*/
        /*반면, 게으른 초기화는 클래스 자체를 로드하는 속도는 빠르지만*/
        /*>> (클래스를 로드할 때 인스턴스를 생성할 필요는 없기 때문에) */
        /*첫 번째 요청에 대한 속도가 두 번째 요청에 대한 속도보다 느리다는 특징을 가지고 있다.*/
        /**/

    }
}
