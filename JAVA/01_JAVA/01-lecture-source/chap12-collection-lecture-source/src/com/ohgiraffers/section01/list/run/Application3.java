package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {

        /*LinkedList*/
        /*ArrayList와 사용하는 방식은 유사한데 내부적으로 요소를 저장하는 방법에 차이가 있다.*/
        /*내부는 이중 연결 리스트로 구현되어있다.*/

        /*단일 연결 리스트: 저장한 요소가 순서를 유지하지 않고 저장되어 이러한 요소 사이를 링크로 연결하여 구성하며*/
        /*마치 연결된 리스트 형태인것처럼 만든 자료구조이다.*/

        /*이중 연결 리스트: 단일 연결 리스트는 다음 요소만 링크하는 반면 이중 연결 리스트는 이전 요소도 링크하여*/
        /*이전 요소로 접근하기 쉽게 고안된 자료구조이다.*/



        List<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("pineapple");

        System.out.println(linkedList.size());

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(i + " : "+linkedList.get(i));
        }

        System.out.println("=============삭제============");

        linkedList.remove(1);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(i + " : "+linkedList.get(i));
        }

        System.out.println(linkedList);
        //toString()이 오버라이드되어있어서 가능

        System.out.println(linkedList.isEmpty());

        //LinkedList 안의 내용물 싹 날리기
        linkedList.clear();
        System.out.println("linkedList 날린거 확인해보기");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(i + " : "+linkedList.get(i));
        }
        //

        /**/
        /**/
        /**/




    }

}
