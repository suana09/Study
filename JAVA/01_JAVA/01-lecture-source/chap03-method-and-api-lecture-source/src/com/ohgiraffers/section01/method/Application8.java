package com.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args) {

        /*수업목표. static method를 호출할 수 있다*/

        /*static method를 호출하는 방법*/
        /* < className.methodName() >*/
        //객체생성을 하지 않았음!!

        System.out.println("10과 20의 합 : "+Application8.sumTwoNum(10, 20)); //classname.methodname()

        /*동일한 클래스 내에 작성된 static method는 클래스명 생략이 가능하다*/

        System.out.println("10과 20의 합 : " + sumTwoNum(120, 20)); //이런식으로!

        /**/
        /**/
        /**/

    }

    public static int sumTwoNum(int first, int second){



        return first+second;
    }
}
