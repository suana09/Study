-- 06_DML.sql
--
--DML (Data Management Language) 데이터 조작 언어
--
--테이블에 레코드를 조작 (추가, 수정, 삭제, 조회) 하기 위한 명령어들
--insert (추가)
--update (수정)
--delete (삭제)
--select (조회 및 선택)

-- [1] 샘플 테이블 생성
create table exam01(
	deptno number(2),
	dname varchar2(15),
	loc varchar2(15)
);

select * from exam01;

--[2] 레코드 추가 

--		방법1
insert into tableName (field1, field2, field3, .....) values (value1, value2, value3, ...);

--		방법2
insert into tableName values (value1, value2, value3, ...);


--		방법1과 방법2의 차이점

--		방법 1) 필드명과 입력되어야 하는 값들을 1:1 매칭하여 입력하는 방법
--					필드명의 순서는 반드시 지켜야하는 것은 아니나 나열된 필드명대로 값들의 순서를 맞춰서 입력해야 함
insert into exam01 (deptno, dname, loc) values ('기획부', 10, '서울'); X
insert into exam01 (deptno, dname, loc) values (10, '기획부', '서울'); O
insert into exam01 (loc, deptno, dname) values ('서울', 10, '기획부'); O
--					null 값을 허용하는 필드나, default 값이 있는 필드는 생략하고 구성 가능
insert into exam01 (deptno, dname) values (10, '기획부'); O


--		방법 2) 모든 필드에 해당하는 값들을 최초의 테이블생성시에 기술한 필드순서에 맞게 모두 입력하는 방법
insert into exam01 values (10, '기획부', '서울'); online
--					방법2는 null을 허용하는 곳을 비우고 입력할 수 없으며, null을 직접 지정해주어야 함
insert into exam01 values (10, null, '서울'); O

--		방법1과 방법2 둘 다 숫자는 그냥 쓰고, 문자는 작은 따옴표로 묶어서 표현함


delete from booklist; --테이블 내의 모든 레코드를 삭제하는 명령

--위 두가지 방법 중 하나를 자유롭게 선택하여 booklist 테이블에 10개의 레코드를 추가해보자
--booknum은 시퀀스를 이용
--grade는 'all', '12', '18' 세가지만 골라서 입력. 자신이 만든 테이블에 grade가 없으면 입력하지 않아도 됨

alter table booklist modify subject varchar2(45);
alter table booklist modify booknum number(35);


insert into booklist values (book_seq.nextVal, '나는 행복한 푸바오 할부지입니다', 2024, 18000, 1800, 'all');
insert into booklist values (book_seq.nextVal, '푸바오, 언제나 사랑해', 2024, 23000, 2300, 'all');
insert into booklist values (book_seq.nextVal, '전지적 푸바오 시점', 2024, 22000, 2200, 'all');
insert into booklist values (book_seq.nextVal, '푸바오, 매일매일 행복해', 2023, 20000, 2000, 'all');
insert into booklist values (book_seq.nextVal, '아기 판다 푸바오', 2021, 18000, 1800, 'all');

insert into booklist values (book_seq.nextVal, '나는 판다입니다', 2024, 23800, 2380, 'all');
insert into booklist values (book_seq.nextVal, '이상한 과자 가게 전천당', 2024, 13000, 1300, 'all');
insert into booklist values (book_seq.nextVal, '알사탕 제조법', 2024, 18000, 1800, 'all');
insert into booklist values (book_seq.nextVal, '작별인사', 2022, 14000, 1400, 'all');
insert into booklist values (book_seq.nextVal, '긴긴밤', 2021, 11500, 1150, 'all');

select*from booklist;

--memberlist 에 10명의 데이터를 추가해주세요 (member_seq 이용)

delete from memberlist;
alter table memberlist modify phone varchar2(35); 

insert into memberlist (membernum, name, phone) values (member_seq.nextVal, '이새림', '010-0000-0000');
insert into memberlist (membernum, name, phone) values (member_seq.nextVal, '임한아', '010-0000-0000');
insert into memberlist (membernum, name, phone) values (member_seq.nextVal, '채연우', '010-0000-0000');
insert into memberlist (membernum, name, phone) values (member_seq.nextVal, '임유정', '010-0000-0000');
insert into memberlist (membernum, name, phone) values (member_seq.nextVal, '최주미', '010-0000-0000');

insert into memberlist values (member_seq.nextVal, '푸바오', '휴대폰없음..', '20210720', null, 'F', 3);
insert into memberlist values (member_seq.nextVal, '아이바오', '휴대폰없음..', '20130713', null, 'F', 10);
insert into memberlist values (member_seq.nextVal, '러바오', '휴대폰없음..', '20120728', null, 'F', 11);
insert into memberlist values (member_seq.nextVal, '루이바오', '휴대폰없음..', '20240704', null, 'F', 0);
insert into memberlist values (member_seq.nextVal, '후이바오', '휴대폰없음..', '20240704', null, 'F', 0);

insert into memberlist values (member_seq.nextVal, '곰돌이', '010-0000-1111', '20210505', 300, 'M', 3);

select*from memberlist;


insert into rentlist values ( rent_seq.nextVal, '2021/10/01', 46, 9, 100);
insert into rentlist values ( rent_seq.nextVal, '2021/10/01', 47, 10, 100);
insert into rentlist values ( rent_seq.nextVal, '2021/10/01', 48, 11, 100);
insert into rentlist values ( rent_seq.nextVal, '2021/10/01', 49, 12, 100);
insert into rentlist values ( rent_seq.nextVal, '2021/10/01', 50, 13, 100);
insert into rentlist values ( rent_seq.nextVal, '2021/10/01', 51, 14, 100);
insert into rentlist values ( rent_seq.nextVal, '2021/10/01', 52, 15, 100);
insert into rentlist values ( rent_seq.nextVal, '2021/10/01', 53, 16, 100);
insert into rentlist values ( rent_seq.nextVal, '2021/10/01', 54, 17, 100);
insert into rentlist values ( rent_seq.nextVal, '2021/10/01', 55, 18, 100);

select * from rentlist;

commit -- 현재창에서 commit은 세미콜론을 붙이지 않음. 단일 명령이며, 다른 명령과 함께 사용하지 않는다는 의미
 


-- 데이터베이스 백업명령
exp userid=scott/tiger file=abc.dmp log=abc.log

-- 데이터베이스 복원명령
imp userid=scott/tiger file=abc.dmp log=abc.log full=y

--오라클의 백업 명령과 복원 명령은 모두 command 창에서 실행됨

