-- 04.DDL_Alter.sql

-- 생성
create table 테이블이름();
create user scott identified by tiger;

--수정
alter table 테이블이름<수정내용>;
alter user 유저이름 identified by 비밀번호;


--1. 필드명 변경
alter table 테이블이름 rename column 변경전필드이름 to 변경후필드이름;


--booklist 테이블의 subject 필드명을 title로 수정
alter table booklist rename column subject TO title;
SELECT * FROM booklist;

--subject 필드명이 title로 변경됨 !!


-- 반대로 title 필드명을 subject 필드명으로 수정해보기
alter table booklist rename column title to subject;

-- booklist의 outprice 필드명을 rentprice로 수정
alter table booklist rename column outprice to rentprice;

-- memberlist 의 membername 필드를 name으로 변경
alter table memberlist rename column membername to name;

-- rentlist의 rent_date 필드를 rentdate로 변경
alter table rentlist rename column rent_date to rentdate;

-- rentlist의 idx 필드를 numseq으로 변경
alter table rentlist rename column idx to numseq;



--2. 필드 자료형 변경
--ALTER TABLE 테이블명 MODIFY 필드명 자료형 [디폴트값 or 제약사항]

--varchar2(12)였던 memberlist 테이블의 name 필드를 varchar2(30) 으로 변경

alter table memberlist modify name varchar2(30);

--직접해보기

--booklist의 booknum 필드를 number(5)로 자료형 변경
alter table booklist modify booknum number(5);		--수정실패

--memberlist의 membernum 필드를 number(5)로 자료형 변경
alter table memberlist modify membernum number(5);		--수정실패

--rentlist의 bnum 필드를 number(5)로 자료형 변경
alter table rentlist modify bnum number(5);		--수정실패

--rentlist의 mnum 필드를 number(5)로 자료형 변경
alter table rentlist modify mnum number(5);		--수정실패

--외래키로 연결되어있는 필드들은 변경하면 오류발생!


-- 외래키로 연결되어서 참조되고, 참조하고 있는 필드들은 위의 명령으로 수정이 바로 불가능함
-- 가능하게 하려면, 외래키 제약 조건을 수정하여 없애고, 참조되는 필드와 참조하는 필드를
-- 모두 수정한 후 외래키 제약 조건을 다시 설정함
-- alter 명령에 의해서 제약조건을 수정 또는 삭제하는 명령은 나중에 학습 예정!


--3. 필드의 추가
-- alter table 테이블명 add 필드명 자료형

--booklist에 구매등급을 저장할 수 있는 grade 필드를 varchar2(15) 로 추가
alter table booklist add grade varchar2(15);

--memberlist에 성별(gender) 필드를 varchar2(3)으로 추가
alter table memberlist add gender varchar2(3);

--memberlist에 나이 (age) 필드를 number(2) 로 추가
alter table memberlist add age number(2);


-- 4. 필드의 삭제
-- alter table 테이블명 drop column 필드명

--memberlist에서 성별 (gender) 필드 제거
--alter table memberlist drop column gender;


--5. 제약조건의 추가/삭제

--필드 레벨의 제약조건의 수정 > modify 명령을 통하여 수정/생성/삭제
--memberlist의 gender 필드에 'M' 또는 'F' 둘 중 하나만 입력되도록 제약조건을 설정한다면
alter table memberlist modify gender varchar2(3) CHECK(gender = 'M' or gender = 'F');
-- or을 써서 'M'혹은 'F' 둘 중 하나가 입력되었는지 check 
alter table memberlist modify gender varchar2(3) CHECK (gender IN ('M', 'F'))
-- gender in('F', 'M') : gender 필드값이 in 함수 안에 있는 값들일때만 true를 결과로

-- Oracle 에서는 문자열을 ' ' 와 " "로 구분하여 쓰지 않고 모두 ' ' 로 표현한다
-- Oracle 에서는 = (대입연산자) 와 == (비교연산자) 의 의미를 딱히 구분하지 않고 = 로 사용한다  



--테이블 레벨의 제약조건 생성/삭제

--테이블 레벨의 제약조건 생성
--추가: alter table 테이블명 add constraint 제약조건명 제약조건식
--테이블 level 의 제약조건은 위의 명령 형식으로 제약조건 이름과 함께 추가 

--memberlist 테이블의 나이(age)필드에 120살이 초가되는 나이는 입력되지 못하도록 제약조건 추가
alter table memberlist add constraint check_age CHECK(age <= 120);


--테이블 레벨의 제약조건 삭제
--삭제: alter table 테이블명 drop constraint 제약조건명

--rentlist 테이블의 bnum에 걸려있는 외래키 제약조건 제거 (fk1)
alter table rentlist drop constraint fk1;

--rentlist 테이블의 mnum에 걸려있는 외래키 제약조건 제거 (fk2)
alter table rentlist drop constraint fk2;

--rentlist 테이블의 기본키 제거 (rent_pk)
alter table rentlist drop constraint rent_pk;


--booklist의 booknum 필드를 number(5)로 자료형 변경
alter table booklist modify booknum number(5);	

--memberlist의 membernum 필드를 number(5)로 자료형 변경
alter table memberlist modify membernum number(5);

--rentlist의 bnum 필드를 number(5)로 자료형 변경
alter table rentlist modify bnum number(5);	

--rentlist의 mnum 필드를 number(5)로 자료형 변경
alter table rentlist modify mnum number(5);	


---------제약조건을 제거 후 자료형 변경 > 성공!


--rentlist 의 기본키 (rent_pk) 를 numseq로 설정
alter table rentlist add constraint rent_pk primary key (numseq);

--rentlist 의 외래키 fk1, fk2 재설정
alter table rentlist add constraint fk1 foreign key (bnum) references booklist(booknum);
alter table rentlist add constraint fk2 foreign key (mnum) references memberlist(membernum);







--테이블 생성 EX
--테이블명: ORDERS1
--필드 :
--ORDER_ID NUMBER(12,0)		ORDER_DATE DATE
-- ORDER_MODE	 VARCHAR2(8)		CUSTOMER_IDNUMBER(6,0)
--ORDER_STATUS NUMBER(2,0)	ORDER_TOTAL NUMBER(8,2)
--SALES_REP_ID NUMBER(6,0)	PROMOTION_ID NUMBER (6,0

--제약사항:
--기본키 ORDER_ID -테이블레벨 (제약명: pk_order)
--ORDER_MODE 에는 'direct', 'online' 만 입력가능 - 테이블레벨 (제약명: ck_order_mode)
--ORDER_TOTAL의 디폴트 값은 0 - 필드레벨
--ORDER_DATE 디폴트값 오늘 날짜 - 필드레벨


create table ORDERS1 (
	order_id number(12, 0),
	order_date date default sysdate,
	order_mode varchar2(8),
	customer_idnumber(6, 0),
	order_status number(2, 0),
	order_total number(8, 2) default 0,
	sales_rep_id number(6, 0),
	promotion_id number(6, 0)
	
	constraint pk_order primary key (order_id),
	constraint ck_order_mode (order_mode in ('direct', 'online'));
);
