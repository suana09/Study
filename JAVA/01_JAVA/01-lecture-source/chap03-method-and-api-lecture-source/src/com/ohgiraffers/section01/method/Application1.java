package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main (String[] args){

        /*수업목표. 메소드의 호출 흐름을 이해할 수 있다 */
        /**/
        /*메소드란?*/
        /*메소드 (method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합을 말한다*/

        /*메소드의 사용목적*/
        /*1. 중복되는 코드를 메소드로 만들어 코드 반복사용을 피함*/
        /*2. 코드의 가독성이 좋아짐*/
        /*3. 기능변경이 필요한 경우 메소드 부분만 수정하면 되기 때문에, 손쉬운 유지보수가 가능*/

        System.out.println("main() 시작...");

        /*1. main method 밖에 methodA라는 메소드를 추가한다.*/
        /*2. 작성한 메소드를 호출하는 부분을 작성한다*/

        /*메소드의 호출방법*/
        /*(Classname) (객체이름) = new (클래스명)();*/ //객체 생성
        /*(객체이름).(메소드명)();*/ //메소드 호출

        Application1 app= new Application1();
        app.methodA();

        System.out.println("main() 끝...");

    }

    public void methodA() {

        //public:접근제한자, 어디서든 쓸 수 있게
        //void: 반환받을 값 X

        System.out.println("학원 GO!");

        methodD();
        methodB();

        System.out.println("학원 BYE!");

    }
    
    public void methodB() {

        System.out.println("9시 30분에 수업을 시작합니다.");

        methodC();

        System.out.println("6시 20분에 수업을 끝냅니다.");

    }

    public void methodC() {

        System.out.println("1시 20분에 점심시간이 시작됩니다.");

        methodE();

        System.out.println("2시 30분에 점심시간이 종료됩니다.");

    }

    public void methodD(){

        System.out.println("\"오늘도 힘내보자 ~ ~ !!\"");

    }

    public void methodE(){

        System.out.println("\"밥 뭐먹지...\"");

    }




}
