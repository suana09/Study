--07_DML_Update

--데이터 변경 - 수정 (update)
--update 테이블명 set (변경내용1, 변경내용2, 변경내용 3, ...) where 검색조건
update memberlist set age=30, phone='010-0000-1111' where membernum = 3;

--

--
--
--명령문에 WHERE 이후 구문은 생략 가능
--다만, 이부분을 생략하면 모든 레코드를 대상으로해서 UPDATE 명령이 실행되어 모든 레코드가 수정됨
--검색조건 : 필드명 (비교-관계연산자) 조건값 으로 이루어진 조건연산,
--흔히 자바에서 if() 괄호안에 사용했던 연산을 그대로 사용하는게 보통
--ex) 나이가 29세 이상 -> WHERE AGE>=29
--두 개 이상의 필드를 수정하고자 한다면 ( , )로 구분하여 기술함
--복합 조건을 사용하고자 한다면 and, or 등을 사용 (&& -> and, || -> or, ! -> not)


--exam
--booklist 테이블의 도서 제목 '아기 판다 푸바오' 도서의 grade를 '12'로 수정
update booklist set grade = '12'  where subject = '아기판다 푸바오'; --책제목은 아기 판다 푸바오 인데 아기판다 푸바오 로 해서 조건에 안걸림
update booklist set grade = '12' where subject like '%아기%'; --like 키워드를 활용하여 '아기' 글자가 들어간 레코드를 모두 조회하도록
update booklist set grade = '12' where subject like '아기%'; -- % 를 작성하는 위치에 따라 앞(아기%), 뒤(%아기), 중간(%아기%) 등으로 활용가능 

--booklist 테이블의 모든 도서의 대여가격 (rentprice)를 10% 인상한 값으로 수정
update booklist set rentprice = rentprice * 1.1;

--memberlist 테이블의 사은포인트 (bpoint)가 300 이상인 회원의 bpoint에 30점 가산
update memberlist set bpoint = (bpoint+30) where (bpoint>=300);

--memberlist 테이블의 생년월일이 null인 회원의 생년월일을 2000-01-01로, age를 23으로 변경
update memberlist set birth = '2000-01-01', age = 23 where (birth is null);

--memberlist 테이블의 gender가 null인 회원의 gender를 'F'로 변경
update memberlist set gender = 'F' where (gender is null);

select*from booklist;
select*from memberlist;


--외래키로 참조되는 필드를 수정
update booklist set booknum = 7 where booknum = 47;
--rentlist에 bnum = 17이 없다면 변경 가능
--rentlist에 bnum = 17이 있다면 변경 불가
--ORA-02292: integreity constraint (SCOTT.FK1) violated - child record found

--해결방법 1) 외래키를 지우고 해당 booknum (booklist) 과 bnum (rentlist) 을 함께 수정한 후 다시 외래키를 설정
--해결방법 2) PL/SQL 의 트리거 기능을 이용하여 동시에 변경 


--레코드의 삭제
--delete from 테이블명 where 조건식
--where 조건식이 생략되면 모든 레코드가 삭제됨

--rentlist 테이블에서 discount가 10 이하인 레코드 삭제
delete from rentlist where discount<=10;


--삭제의 제한
delete from booklist where booknum=47; 
-- integreity constraint (SCOTT.FK1) violated - child record found


--해결방법 1)
--rentlist 테이블에서 해당 도서 대여목록 레코드 (child record)를 모두 삭제한 후
--booklist 테이블에서 해당 도서 삭제
delete from rentlist where bnum=47;
delete from booklist where booknum=47;


--해결방법 2)
--외래키 제약조건을 삭제 후 다시 생성
--외래키 생성시 "옵션을 추가하여"
--"참조되는 값 (parents record) 이 삭제되면 참조하는 값 (child record)도 같이 삭제" 되도록 정의


--외래키 삭제
alter table rentlist drop constraint fk1;

--새로운 외래키 추가
alter table rentlist add constraint fk1
foreign key (bnum) references booklist(booknum) on delete cascade;

--memberlist 테이블에서 회원 한 명을 삭제하면, rentlist 테이블에서도 해당 회원이 대여한 기록을 함께 삭제하도록
--외래키 fk2의 설정 바꾸기

alter table rentlist drop constraint fk2;
alter table rentlist add constraint fk2 foreign key (mnum) references memberlist(membernum) on delete cascade;
