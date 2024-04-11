package com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {
        A_if a = new A_if();
        /*단독 if문 흐름 확인용 메소드 출력*/
        //a.testSimpleIfStatement();

        /*중첩 if문 흐름 확인용 메소드 출력*/
        //a.testNestedIfStatement();

        B_ifElse b = new B_ifElse();
        //b.simpleIfElseStatement();
       // b.testNestedIfElseStatement();

        C_ifElseif c = new C_ifElseif();
        //c.testNestedIFElseIfStatement();
        //c.testSimpleIfElseIfStatement();

        D_switch d = new D_switch();
        //d.testSimpleSwitchStatement();
        //d.testSwitchVendingMachine();

        practice p = new practice();
        p.methodS();


    }
}
