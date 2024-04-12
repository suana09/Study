--10_View.sql

--
--* 오라클 - 뷰(View)
--
--		물리적인 테이블에 근거한 논리적인 "가상 테이블." -> 저장되어 있는 select 문
--		가상이란 단어는 실질적으로 데이터를 저장하고 있지 않기 때문에 붙인 것이고,
--		테이블이란 단어는 실질적으로 데이터를 저장하고 있지 않더라도 
--		사용 계정자는 마치 테이블을 사용하는 것과 동일하게 뷰를 사용할 수 있기 때문에 붙인 것.

--		뷰는 기본테이블에서 파생된 객체로서 기본테이블에 대한 하나의 쿼리문임.
--		실제 테이블에 저장된 데이터를 뷰를 통해서 볼 수 있도록 함.


-- 뷰 생성 방법
create or replace view 뷰이름 as select 조회 명령 (select~);

create or replace view empinfo as 
--[[
select a.empno as "사원번호", 
	a.ename as "사원이름", 
	a.deptno as "부서번호", 
	b.dname as "부서명", 
	b.loc as "부서위치"
from emp a, dept b
where a.deptno = b.deptno;
--]]--
--이 안의 select 커맨드를 empinfo 라는 view 을 생성하여 안에 저장해주겠다는 선언


select*from empinfo;


--rentlist, memberlist, booklist 가 join된 결과를 report 라는 이름의 View를 생성하여 출력
--대여일자, 대여도서번호, 제목, 대여회원번호, 이름, 매출액 (rentprice - discount)

select*from RENTLIST;

create or replace view report as
select a.rentdate as "대여일자",
	a.bnum as "대여도서번호",
	b.subject as "대여도서제목",
	a.mnum as "대여회원번호",
	c.name as "대여회원이름",
	b.rentprice - a.discount as "매출액"
from rentlist a, booklist b, memberlist c
where a.bnum = b.booknum and a.mnum = c.membernum
order by bnum;

select*from report;