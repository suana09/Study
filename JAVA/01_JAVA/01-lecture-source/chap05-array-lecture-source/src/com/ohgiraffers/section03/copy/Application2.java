package com.ohgiraffers.section03.copy;

public class Application2 {
    public static void main(String[] args) {
        /*얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다.*/
        
        /*얕은 복사의 활용*/
        /*얕은 복사를 활용하는 것은 주로 메소드 호출시 인자로 사용하는 경우와*/
        /*리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.*/
        
        String[] name = {"홍길동", "유관순", "이순신"};

        System.out.println("name.hashCode() = " + name.hashCode()); //1283928880

        /*1. 인자와 매개변수로 활용*/
        print(name); //1283928880

        /*2. 리턴값으로 활용*/
        String[] animalsRe = getAnimals();

        System.out.println("리턴 받은 animalsRe.hashCode() = " + animalsRe.hashCode()); //1989780873

        print(animalsRe); //1989780873
    }

    public static void print (String[] sarr){

        System.out.println("sarr.hashCode() = " + sarr.hashCode());
        for(int i=0;i<sarr.length;i++){
            System.out.println(sarr[i]+" ");
        }
        System.out.println();
    }

    public static String[] getAnimals(){ //매개변수가 없이 리턴값만 받는 메소드

        String[] animals = new String[]{"뱀","판다","다람쥐"};

        System.out.println("새로 만든 animals의 hashCode = " + animals.hashCode()); //1989780873

        return animals;
    }

}
