package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

    //메소드에 위임해주어야 함
    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
        //throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException > throws Exception으로도 가능

        if (price < 0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }

        if (money < 0) {
            throw new MoneyNegativeException("가진 돈은 음수일 수 없습니다.");
        }

        if (money < price) {
            throw new NotEnoughMoneyException("가진 돈보다 상품 가격이 높습니다.");
        }

        System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑 되세요!");
    }
}
