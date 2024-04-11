package com.ohgiraffers.section06.parameter;

public class Application {
    public static void main(String[] args) {

        /*메소드의 파라미터에 대해 이해하고 사용할 수 있다*/

        /*parameter로 사용 가능한 자료형*/
        /*1. 기본자료형*/
        /*2. 기본자료형 배열*/
        /*3. 클래스자료형*/
        /*4. 클래스자료형 배열*/
        /*5. 가변인자*/

        /*인스턴스 생성*/
        ParameterTest pt = new ParameterTest();

        int num = 10;
        pt.testPrimaryType(num);

        /*2. 기본자료형 배열을 매개변수로 전달받는 메소드 호출 확인*/

        int[] iarr = new int[]{1, 2, 3, 4, 5};

        System.out.println("인자로 전달하는 값 = " + iarr);
        pt.testPrimaryTypeArray(iarr);
        /**/
        //얕은 복사를 하기 때문에 매개변수로 배열을 전달받아 출력하면 해당 배열의 주소값을 출력

        /*3. 클래스 자료형 */
        RectAngle r = new RectAngle(12.5, 22.5);
        System.out.println("인자로 전달하는 값 : "+r);
        pt.testClassType(r);
        //클래스도 얕은 복사를 하기 때문에 해당 배열의 주소값을 출력


        /*4. 클래스자료형 배열은 뒤에 다룰 예정*/
        
        /*5. 가변인자*/
        pt.testVariableLengthArray("곰돌이");//가변인자는 전달하지 않아도 됨
        pt.testVariableLengthArray("곰돌이", "누나랑 놀기");//1개도 전달가능
        pt.testVariableLengthArray("푸바오", "남천나무 괴롭히기","방사장에서 구르기","할부지한테 안마받기");
        //갯수제한없이 전달가능
        pt.testVariableLengthArray("후이바오",new String[]{"언니랑 놀기","엄마랑 놀기","유채 괴롭히기"});
        //배열도 전달가능

        /*!!!!!!!!!!!!!!!!*/
        /*가변인자 사용 시 주의사항 : */
        /**/

    }




}
