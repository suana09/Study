package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        //multiblock
        try {
            //try: 실행
            //et.checkEnoughMoney(2000, 50000);
            et.checkEnoughMoney(50000, 30000);

            //위의 메소드에서 exception을 catch하면 아래에 있는 줄의 코드는 실행되지 X
            System.out.println("정상동작하니?");

        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException occured");
            System.out.println(e.getMessage());
        } catch (PriceNegativeException e) {
            //예외를 catch 해서 처리
            System.out.println("PriceNegativeException occured");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (MoneyNegativeException e) {
            System.out.println("MoneyNegativeException occured");
            System.out.println(e.getMessage());
        } finally {
            /*예외 발생 여부와 관계없이 실행되는 블록*/
            System.out.println("finally block code working");
        }

        System.out.println("프로그램을 종료합니다.");

    }

}
