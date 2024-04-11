package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {
    public static void main(String[] args) {

        /*LinkedHashSet 클래스*/
        /*HashSet의 기능을 모두 가지고 있고 추가적으로 저장순서를 유지하는 기능을 하고 있다*/

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("곰돌이");
        linkedHashSet.add("고양이");
        linkedHashSet.add("강아디");
        linkedHashSet.add("토끼");
        linkedHashSet.add("병아리");

        System.out.println("linkedHashSet = " + linkedHashSet);
        //linkedHashSet = [곰돌이, 고양이, 강아디, 토끼, 병아리]
        //저장순서 유지됨

        //treeset 객체를 생성할 때 생성자 매개변수 안에 정렬하고 싶은 객체를 넣어주면 오름차순으로 정렬됨
        TreeSet<String> tset = new TreeSet<>(linkedHashSet);
        System.out.println("tset = " + tset);
        //tset = [강아디, 고양이, 곰돌이, 병아리, 토끼]
        //오름차순 정렬됨

        /**/
        /**/
        /**/
        /**/
        /**/
        /**/


    }
}
