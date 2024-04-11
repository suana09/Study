package com.ohgiraffers.section01.array;

public class Application5 {
    public static void main(String[] args) {

        /*수업목표. 배열을 사용하는 예시를 이해하고 적용할 수 있다.*/
        /*랜덤한 카드를 한 장 뽑아서 출력해보자*/

        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        java.util.Random rn = new java.util.Random();
        int randomCardNumIndex = (int)(Math.random()* cardNumbers.length);
        System.out.println(" 당신이 뽑은 카드는 = " + cardNumbers[randomCardNumIndex] + " 카드 입니다.");

        //java.lang.Math class의 math.Random 사용!
        //cardNumbers 배열의 index를 random으로 뽑아와서 println

        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
    }
}
