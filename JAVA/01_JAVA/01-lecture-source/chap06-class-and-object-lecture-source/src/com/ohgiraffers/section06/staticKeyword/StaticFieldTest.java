package com.ohgiraffers.section06.staticKeyword;

public class StaticFieldTest {
    private int nonStaticCount;
    private static int staticCount;

    public StaticFieldTest(){} //기본생성자

    public int getNonstaticCount() {
        return this.nonStaticCount;
    }

    public int getStaticCount() {
        return StaticFieldTest.staticCount; //static field는 this. 키워드 대신 클래스명.필드명으로 접근하는 것이 관례
    }

    public void increaseNonStaticCount(){this.nonStaticCount++;}
    public void increaseStaticCount(){StaticFieldTest.staticCount++;}

}
