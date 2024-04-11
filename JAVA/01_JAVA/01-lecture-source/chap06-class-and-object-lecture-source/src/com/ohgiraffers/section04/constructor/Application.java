package com.ohgiraffers.section04.constructor;

public class Application {
    public static void main(String[] args) {
        /*수업목표. 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다.*/

        /*생성자란?*/
        /*인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를 생성할 때 호출한다.*/
        /*생성자 함수에 매개변수가 없는 생성자를 기본생성자(default constructor)라고 하며*/
        /*기본생성자는 compiler에서 자동으로 추가되기 때문에 명시적으로 작성하지 않고 사용할 수 있다.*/
        /*인스턴스 생성 시 별도로 수행할 명령이 없었기 때문에 아무것도 작성하지 않은 것이다.*/

        /*기본생성자 호출하여 인스턴스 생성 후 필드값 출력*/

        User user1 = new User();
        System.out.println(user1.getinformation());

        //매개변수가 없는 생성자는 명시적으로 (이렇게 :  public User(){}; ) 작성해주지 않아도 컴파일러가 자동으로 추가해줌


        /*매개변수를 전달 받는 생성자를 호출해 인스턴스 생성 후 필드값 출력 */

        User user2 = new User("최강곰돌1", "누나바보", "곰도리");
        System.out.println(user2.getinformation());

        //매개변수가 있는 생성자는 생성자를 무 조 건 ! ! 따로 만들어줘야 함
        //따로 setting method 를 작성해주지 않아도 인스턴스 생성과 필드 초기화까지 함께 가능
        // >>>> 코드를 간결하게 짤 수 있음
        

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
