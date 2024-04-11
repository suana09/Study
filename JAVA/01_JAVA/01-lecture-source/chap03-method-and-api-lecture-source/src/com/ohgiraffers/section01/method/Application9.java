package com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args) {
        /*수업목표. 다른 클래스에 작성한 메소드를 호출할 수 있다*/
        /*다른 클래스에 작성한 메소드 호출*/

        /*최대값 최솟값을 비교할 두 정수를 변수로 선언*/
        int first = 100;
        int second = 50;



        /*다른 클래스에 작성한 메소드 실제로 호출해보기*/

        /*non-static method의 경우*/
        /*클래스가 다르더라도 사용하는 방법은 동일*/
        /*className objName = new 클래스명();*/
        /*objName.methodName(); */

        Calculator cal = new Calculator(); //객체생성
        System.out.println("두 수 중 최소값은? " + cal.minNumberOf(first, second));
        //다른 클래스에 있는 메소드도 non-static method 호출방법과 같음

        /*static method의 경우*/
        /*다른 클래스에 작성한 static method의 경우 호출할 때 클래스명을 반드시 기술하여야 한다*/
        /*className.methodName();*/
        /**/

        //int max = maxNumberOf(first, second); //클래스명을 생략하면 에러가 발생
        int max = Calculator.maxNumberOf(first, second);


        Calculator cal2 = new Calculator();
        System.out.println("test"+cal2.maxNumberOf(first, second));

        /*static method는 non-static method처럼 호출은 가능하지만 권장하진 않음*/
        /*이미 메모리에 로딩되어있는 static method는 여러 객체가 공유하게 됨*/
        /*그때 객체로 접근하게 되면 인스턴스가 가진 값으로 공유된 값에 예상치 못한 동작을 유발할 수 있기 때문에*/
        /*사용을 제한하라는 경고가 뜨는 것*/
        /*시스템이 복잡할수록 유지보수에 좋지 않음!*/




    }
}
