package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        /*Map 인터페이스의 특징*/
        /*Collection임에도 불구하고 Collection 인터페이스와 다른 저장방식을 가진다.*/
        /*키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.*/


        /*키 (key)란?*/
        /*값 (value)를 찾기 위한 이름 역할을 하는 객체를 의미한다*/
        /*1. 요소의 저장순서를 유지하지 않는다*/
        /*2. 키는 중복 허용하지 않지만 키가 다르면 중복되는 값을 저장 가능하다.*/

        /*HashMap 검색속도가 매우 빠르다.*/
        HashMap hashMap = new HashMap(); //raw type of HashMap
        hashMap.put("one", new Date()); //(object key, object value)
        hashMap.put(12, "red apple");
        hashMap.put(33, 123);

        System.out.println("hashMap = " + hashMap);
        //hashMap = {33=123, one=Fri Apr 05 10:10:01 KST 2024, 12=red apple}

        /*HashMap은 저장한 순서가 유지되지 않는 것 같다*/

        hashMap.put(12, "banana");
        System.out.println("hashMap = " + hashMap);
        //hashMap = {33=123, one=Fri Apr 05 10:11:02 KST 2024, 12=banana}
        //red apple 이 banana로 override 됨 - 이미 존재하는 key에 또 value를 저장하려고 하면 덮어쓰기 됨

        hashMap.put(11, "banana");
        hashMap.put(9, "banana");

        System.out.println("hashMap = " + hashMap);
        //hashMap = {33=123, one=Fri Apr 05 10:12:15 KST 2024, 9=banana, 11=banana, 12=banana}
        //key가 다르다면 value가 같아도 OK

        System.out.println("value of key(9) = " + hashMap.get(9));
        //value of key(9) = banana

        hashMap.remove(9); //9번 키의 밸류를 삭제
        System.out.println("value of key(9) = " + hashMap.get(9)); //null

        System.out.println("hashMap.size() = " + hashMap.size()); //몇 개가 저장되어있는지 확인

        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("one", "java");
        hashMap2.put("two", "oracle");
        hashMap2.put("three", "jdbc");
        hashMap2.put("four", "html");
        hashMap2.put("five", "css");


        //반복자를 이용하여 hashMap의 key와 value 를 출력
        Iterator<String> keyIter = hashMap2.keySet().iterator();


        while (keyIter.hasNext()) {
            String key = (String) keyIter.next();
            String value = (String) hashMap2.get(key);
            System.out.println(key + " : " + value);
        }


        //collection에 담아 반복자를 이용하여 출력
        Collection<String> values = hashMap2.values();
        Iterator<String> valueIter = values.iterator();

        while (valueIter.hasNext()) {
            System.out.println("valueIter.next() = " + valueIter.next());
        }


        //Object의 배열로 만들어 거기 담아 출력
        Object[] valueArr = values.toArray();
        for (int i = 0; i < valueArr.length; i++) {
            System.out.println(i+" : valueArr[i] = " +valueArr[i]);
        }


        //Set 에 담기
        Set<Map.Entry<String, String>> set = hashMap2.entrySet();
        //entryset() 메소드 컨트롤클릭으로 눌러서 확인해보시오

        //Entry로 처리
        Iterator<Map.Entry<String, String>> entryIter = set.iterator();

        while (entryIter.hasNext()) {
            Map.Entry<String, String> entry = entryIter.next();
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }



        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/

    }

}
