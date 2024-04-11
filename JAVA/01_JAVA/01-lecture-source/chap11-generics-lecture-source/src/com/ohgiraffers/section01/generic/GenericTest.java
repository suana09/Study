package com.ohgiraffers.section01.generic;

public class GenericTest<T> {


    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() { //getter에도 사용가능 (리턴타입 T)
        return this.value;
    }


}
