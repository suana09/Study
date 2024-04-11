package com.ohgiraffers.section02.variable;

public class Application3 {
    public static void main (String[] args){

        //아허리아파 허리아파 허 리 아 파 ~~~~~~~~
/*         수업목표 : 변수의 명명 규칙에 대해 이해할 수 있다. */

/*         변수의 명명 규칙
         변수의 이름을 지을 때에는 아무렇게나 짓는 것이 아닌, 정해진 규칙이 있다.
         실무에서 굉장히 중요하기 때문에 반드시 숙지해야 하며
         규칙에 맞는 올바른 변수명을 짓는 것이 좋은 프로그래밍을 하는 첫 단추이다.


         변수의 명명 규칙
         1. 컴파일 에러를 발생시키는 규칙
        *   1-1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다.*/
            int age = 20;
            //int age = 30; // 동일한 변수명을 가지므로 에러 발생

/*        *   1-2. 예약어* 는 사용이 불가능하다.
        *   (*예약어: 자바에서 미리 사용하겠다고 컴파일러와 약속한 키워드)*/
            //int true = 1; // error!


/*        *   1-3. 변수명은 대/소문자를 구분한다
        *   - 자바는 대/소문자를 구분하는 언어이다.*/
            int Age = 20;
            int True = 10;

/*        *   1-4. 변수명은 숫자로 시작할 수 없다
        *   - 숫자를 섞어서 사용하는 것은 가능*/
            //int 1age = 10; // error!
            int age1 = 10; //ok

/*        *   1-5. 특수기호는 '_', '$' 만 사용 가능하다.
        *   - 따라서 공백은 사용할 수 없다.*/
            //int age@ = 20; // error!
            int _age = 20;
            int a$ge = 20;

/*        * 2. 컴파일 에러를 발생시키지는 않지만 개발자들 사이에서의 암묵적인 규칙
        *   2-1. 변수명의 길이 제한은 없다.
        *   -하지만 적당히 해야겠죠..?*/
            int aldsjfladjflajdflajdflajsdsakjhfdakljsfwiuquer; //에바죠?

 //     *   2-2. 변수명이 합성어로 이루어진 경우 첫번째 단어는 소문자, 두번째 단어는 대문자로 시작한다(camel-case)
            int maxAge;
            int minAge;

        /*  2-3. 단어와 단어 사이의 연결은 언더스코어 (_) 를 사용하지 않는다.
        *   - 타 언어의 네이밍 규칙이다*/
            String user_name ; // XXX
            String userName ; //camelcase

///*        *   2-4. 한글로 변수명을 짓는 것은 가능하지만, 권장하지 않는다.
//        *   - 한글을 취급하는 다양한 방식들이 존재하기 때문에 에러를 유발시킬 수 있다.*/
            int 나이;


/*        *   2-5. 변수 안에 저장된 값이 어떤 의미를 가지는지 정확히 표현하도록 한다.*/
            String s;
            String name;

/*        *   2-6. 전형적인 변수 이름이 있다면 가급적 그것을 사용하도록 한다.*/
            int sum = 0;
            int max=0;
            int min=0;
            int count=0;

/*        *   2-7. 명사형으로 작성한다.*/
            String goHome;
            String home;

/*        *   2-8. boolean 형은 의문문으로, 가급적이면 긍정형태로 짓는다.*/
            boolean isAlive = true;
            boolean isDead = false; // 부정형보다는 긍정형 우선




    }
}
