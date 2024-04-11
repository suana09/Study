package com.ohgiraffters.section03.overriding;

public class SubClass extends SuperClass {

    /*1. 메소드 이름 변경시 에러발생*/

/*    @Override
    public void method1(int num) {
    }*/

    /*2. 메소드의 리턴타입 변경시 에러발생*/

/*    @Override
    public int method(int num) {
        return 0;
    }*/

    /*3. 매개변수의 갯수와 타입 변경시 에러발생*/

/*    @Override
    public void method(int num) {
    }*/

    /*4. 메소드이름, 리턴타입, 매개변수의 갯수와 타입과 순서가 모두 일치할 경우 오버라이딩 성립*/

    /*5. private method cannot be overriding*/
/*    private void privateMethod() {}*/

    /*6. final method cannot be overriding */

/*    public final void finalMethod() {}*/

/*    @Override
    void protectedMethod(){}*/ //attempting to assign weaker access privileges
    //protected is weaker then default access privileges

    @Override
    protected void protectedMethod() {} //같은 범위

    /*참고로 클래스에도 final 키워드를 추가할 수 있는데 이는 상속을 제한하는 키워드임*/



}
