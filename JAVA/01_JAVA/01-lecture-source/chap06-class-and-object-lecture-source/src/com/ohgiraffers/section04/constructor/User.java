package com.ohgiraffers.section04.constructor;

public class User {
    private String id;
    private String pw;

    private String name;
    private java.util.Date enrollDate;

    /*생성자의 작성 위치*/
    /*작성 위치는 문법상으로는 클래스 내부에 작성하면 되지만*/
    /*통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는것이 관례이다.*/

    /*
     *  생성자의 사용 목적
     *  1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다.
     *  2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하며 인스턴스를 생성할 목적으로 주로 사용된다.
     *  3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않겠다는 의미를 가진다.
     *     따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수 도 있다. (초기값 전달 강제화)
     * */

    /*
     *  생성자 작성 방법
     *  [표현식]
     *  접근제한자 클래스명(매개변수) {
     *      인스턴스 생성 시점에 수행할 명령 기술 (주로 필드를 초기화)
     *      this.필드명 = 매개변수;		//설정자(setter) 여러 개의 기능을 한 번의 호출로 수행할 수 있다.
     *  }
     * */

    //매개변수가 있는 생성자 : 인스턴스를 생성과 동시에 값을 대입하여 set


    /*생성자 작성 시 주의할 점*/
    /*1. 생성자 메소드는 반드시 클래스 이름과 동일해야 한다. 대/소문자까지 같아야 함.*/
    /*2. 생성자 메소드는 반환형을 작성하지 않는다. (작성하는 경우 메소드로 인식한다.)*/

    /*1. 기본생성자(default constructor*/

    public User(){
        /*수행할 내용이 아무것도 존재하지 않는다.*/
        /*호출 확인을 위한 출력구문만 작성해보자*/

        /*메소드와 같이 수행할 명령을 작성할 수 있다.*/

        System.out.println("기본 생성자 호출...");

    }



    /*주의사항. 동일한 이름의 생성자 혹은 메소드를 한 클래스 내에서 작성하는 것은 불가능하다. 그러나 ...*/


    /*2. 매개변수 있는 생성자*/
    /*id, pw, name의 초기화를 담당할 생성자*/


    /*단 , 매개변수 있는 생성자의 경우 매개변수의 타입, 갯수가 다르면 생성 가능하다*/
    /*오버로딩, 오버라이딩*/


    public User(String id, String pw, String name) {

        this.id = id;
        this.name = name;
        this.pw = pw;

        System.out.println("id, pw, name 을 초기화하는 생성자 호출됨..");
    }









    public String getinformation() {
        return "User{" +
                "id='" + this.id + '\'' +
                ", pw='" + this.pw + '\'' +
                ", name='" + this.name + '\'' +
                ", enrollDate=" + this.enrollDate +
                '}';
    }

    /**/
    /**/
    /**/
    /**/
    /**/
    /**/
    /**/
    /**/

}
