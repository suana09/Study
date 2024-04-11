package com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass{

    /*@Override
    public void method() {}*/ //예외없이 오버라이딩 가능 근데 예외없이가 무슨말이지......

    /*@Override
    public void method() throws IOException {}*/

    /*@Override
    public void method() throws Exception {}*/
    //부모클래스가 throw하고 있는 exception보다 상위 클래스의 exception에는 cannot throw

    @Override
    public void method() throws FileNotFoundException {}
    //FileNotFoundException is lower than IOException in inheritance relationship so
    //this method does not occur error

}
