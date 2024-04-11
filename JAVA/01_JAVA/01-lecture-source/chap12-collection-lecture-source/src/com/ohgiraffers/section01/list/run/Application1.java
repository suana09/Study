package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /*컬렉션 프레임워크에 대해 이해할 수 있다.*/

        /*컬렉션 프레임워크*/
        /*자바에서 컬렉션 프레임워크는 여러개의 다양한 데이터를 쉽고 효과적으로 처리할 수 있도록*/
        /*표준화된 방법을 제공하는 클래스의 집합을 의미한다*/

        /*컬렉션 프레임워크는 크게 3가지 인터페이스 중 한가지를 상속받아 구현해놓았다*/
        /*1. List interface */
        /*2. Set interface */
        /*3. Map interface */


        /*List interface의 특징*/
        /*1. 순서가 있는 데이터 집합으로 데이터 중복 저장을 허용한다.*/
        /*2. Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.*/
        /*3. 요소의 저장 순서가 유지된다.*/


        /*ArrayList*/
        /*배열의 단점을 보완하기 위해 만들어졌다.*/
        /*배열은 크기 (길이)를 변경할 수 없고 요소의 추가, 삭제, 정렬등이 복잡하다는 단점이 있다.*/
        /*이러한 배열의 단점을 보완하고자*/
        /*크기변경 (새로운 더 큰 배열을 만들고 옮기기), 요소의 추가·삭제·정렬 기능들을 미리 메소드로 구현하여 제공한다.*/

        ArrayList arrayList = new ArrayList();
        //ArrayList는 인스턴스를 생성하면 기본적으로 길이 10의 배열을 생성한다.

        List list = new ArrayList(); //ArrayList implements List

        Collection collection = new ArrayList(); //List extends Collection

        arrayList.add("apple");
        arrayList.add(123); //값 > 객체로 오토박싱
        arrayList.add(45.67);
        arrayList.add(new Date());

        System.out.println("arrayList = " + arrayList);



        //.size()
        /*ArrayList는 get()을 이용하여 꺼내며 size()로 요소의 갯수를 반환한다.*/
        arrayList.size();
        System.out.println("arrayList.size() = " + arrayList.size());

        //arrayList의 원소들을 for문으로 출력하기
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + " : "+arrayList.get(i)); //배열명[인덱스숫자]가 아님!
        }

        //.add()
        arrayList.add("apple");
        System.out.println("arrayList = " + arrayList);

        arrayList.add(1, "banana"); //인덱스의 위치를 지정하여 원소 삽입
        System.out.println("arrayList = " + arrayList);

        //.remove()
        arrayList.remove(2); //지정한 인덱스의 원소를 삭제
        System.out.println("arrayList = " + arrayList);

        //.set()
        arrayList.set(1, Boolean.valueOf(true)); //지정한 인덱스의 원소를 다른 원소로 대체
        System.out.println("arrayList = " + arrayList);

        /*모든 컬렉션 프레임워크 클래스는 제네릭 클래스로 작성되어있다.*/
        List<String> strings = new ArrayList<>();

        /*제네릭 타입을 지정하면 지정된 타입 외에는 인스턴스를 생성하여 저장할 수 없다.*/
        strings.add("apple");
        //strings.add(123); strings 의 타입을 String 으로 지정해주었기 때문에 안 됨
        strings.add("banana");
        strings.add("orange");
        strings.add("mango");
        strings.add("grape");
        strings.add("pomegranate");

        System.out.println("strings = " + strings);

        //Collections.sort() : 사전 순서대로 정렬
        /*Collections 클래스의 static method sort()*/
        /*인터페이스명에 s가 붙은 클래스는 관례상 비슷한 방식으로 작성된 클래스를 의미한다.*/
        Collections.sort(strings);

        System.out.println("strings = " + strings); //사전(dictionary) 순서대로 정렬됨


        /*기본적으로 ArrayList는 내림차순을 제공하지 않음 */
        /*역순 정렬기능은 LinkedList class에 포함되어 있는데, List로 공간을 선언했기 때문에*/
        /*ArrayList에서 LinkedList로 변경할 수 있다.*/

        strings = new LinkedList<>(strings);

        /*Iterator 반복자 인터페이스를 활용하여 역순으로 정렬한다*/
        /*LinkedList타입으로 형변환 후 descendingIterator() 메소드를 사용하면*/
        /*내림차순으로 정렬된 타입의 목록으로 반환해준다*/
        /*hasNext() : 다음 요소를 가지고 있는 경우 true, 더이상 요소가 없는 경우 false*/
        /*next() : 다음 요소를 반환*/


        /*Collection 인터페이스의 Iterator() 메소드를 이용하여 인스턴스를 생성할 수 있다.*/
        /*컬렉션에서 값을 읽어오는 방식을 동일한 방식으로 제공하기 위해 사용한다.. 응?*/
        /*반복자라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.. 이게무슨문장이지 ㅠㅠ*/
        /*인덱스로 관리되는 컬렉션이 아닌 경우에 반복문을 사용해서 요소에 하나식 접근할 수 없기 때문에*/
        /*인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이다.*/


        Iterator<String> dIter = ((LinkedList<String>)strings).descendingIterator();
        // strings 를 LinkedList<String> 으로 형변환한 것으로 descendingIterator method 를 호출

        while (dIter.hasNext()) {
            System.out.println(dIter.next());
        }

        System.out.println("====================");

        while (dIter.hasNext()) {
            System.out.println(dIter.next());
        }

        //descendingIterator()메소드는 재사용 불가 - ?

        List<String> decsList = new ArrayList<>();

        while (dIter.hasNext()) {
            decsList.add(dIter.next());
        }

        System.out.println("decsList = " + decsList);

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
