package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        /*ArrayList 정렬 기능을 이해할 수 있다*/

        //List로 생성해주는 게 좋음
        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 100000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));

        /*제네릭 타입 제한에 의해 comparable 타입을 가지고 있는 경우에만 sort가 가능*/
        //그래서 뭐의? comparable type이란소리지..


        /*우리가 만든 DTO의 경우 이런 방식을 사용하지 못한다. 그래서 다른 방법을 사용해야 한다.*/

        //Collections.sort(bookList);// 안됨

        for (BookDTO book : bookList) {
            System.out.println(book);
        }

        System.out.println("==============");

        bookList.sort(new AscendingPrice());

        for (BookDTO book : bookList) {
            System.out.println(book);
        }



        //왜 ascendingPrice클래스를 만들어서 comparator 클래스를 정의해준거지.. 왜 collections.sort() 는안된거지
        //왜지?
        //방금 설명해주심.. 이건 우리가 만든 dto라서 ... ? 할수없는거래..
        //아~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //dto 안에는 이름도있고 제목도있는데 걔네를 다 sort할순없으니깐
        //bookList안에 여러가지 값들이 있고 거기서 price만 떼서 sort하려고 클래스를 만들어서 comparator 클래스를 재정의한거인듯




        /*어쩌구저쩌구..익명클래스도 사용가능*/
        /*바로 재정의해서 사용*/
        /**/

        /*Comparator 인터페이스 : List 클래스의 default method인 sort() 메소드 인자로 */
        /*정렬의 기준이 되는 인스턴스를 넣어주게 되면 우리가 오버라이딩한 메소드가 동작하게 되어 그걸 기준으로 삼는다.*/
        bookList.sort(new Comparator<BookDTO>() { //익명클래스
            @Override
            public int compare(BookDTO o1, BookDTO o2) {

                return o1.getTitle().compareTo(o2.getTitle());

                //getTitle로 인스턴스를 넣어준거다이거지그니깐
            }
        });

        System.out.println("===========제목 오름차순 정렬===========");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }

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
