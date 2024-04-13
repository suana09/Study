--09.join.sql

select * from emp;
select * from dept;
drop table emp2;
create table emp2 as select ename, deptno from emp where job = 'SALESMAN';
select * from emp2;


--[1] 사원명이 'SCOTT'인 사원의 부서명을 알고 싶을 때
select deptno from emp where ename = 'SCOTT'; --20
select dname from dept where deptno=20; --research

--서브쿼리 사용
select dname from dept where deptno = (select deptno from emp where ename = 'SCOTT');



------------------------------------------------------------------------------------------------------------

--join
--두 개 이상의 테이블에 나눠져 있는 관련 데이터들을 하나의 테이블로 모아서 조회하고자 할 때 사용하는 명령


--cross join : 두 개 이상의 테이블이 조인되는 것
--	* 가장 최악의 결과를 얻는 조인 방식
select * from emp2, dept;

-- equi join : 조인 대상이 되는 두 테이블에서 공통적으로 존재하는 컬럼의 값이 일치하는 행을 연결하여 결과를 생성
select * from emp2, dept where emp2.deptno = dept.deptno;

select * from emp2 a, dept b where a.deptno = b.deptno;

select * from emp a, dept b where a.deptno = b.deptno;

select*from memberlist;

--rentlist 의 대여일자, 대여도서번호, 대여회원번호, 할인금액을 출력하되 도서의 제목을 도서번호 옆에 출력하세요

select a.rentdate, a.bnum, b.subject, a.mnum, a.discount from rentlist a, booklist b where a.bnum = b.booknum;

--rentlist의 대여일자, 대여도서번호, 대여회원번호, 할인금액을 출력하되 회원의 이름을 도서번호 옆에 출력하세요

select a.rentdate as "대여일자", 
	a.bnum as "대여도서번호", 
	b.subject as "도서제목", 
	a.mnum as "회원번호", 
	c.name as "회원이름", 
	a.discount as "할인금액", 
	b.rentprice-a.discount as "매출액" 
	from rentlist a, booklist b, memberlist c 
	where a.bnum = b.booknum and a.mnum = c.membernum
	order by b.subject;
	
	
--non-equi join
--동일 컬럼이 없어서 다른 조건을 사용하여 join
--join 조건에 특정 범위내에 있는지를 조사하기 위해 조건절에 join 조건을 '=' 연산자 이외의 비교
select*from emp;
select*from salgrade;

select a.ename, a.sal, b.grade
	from emp a, salgrade b
	where a.sal >= b.losal and a.sal <= b.hisal;
	
select a.ename, a.sal, b.grade
	from emp a, salgrade b
	where a.sal between b.losal and b.hisal;


--outer join
--join 조건에 만족하지 못하여 해당 결과를 출력 시 누락이 되는 문제점이 발생할 경우, 해당 레코드를 출력하는 join
--booklist와 rentlist를 join하여 책들의 대여기록을 보고 싶은데, 다음과 같은 방식으로 출력할 경우 대여기록이 없는 책은 아예 출력되지 않음.
select a.booknum, a.subject, b.rentdate from booklist a, rentlist b
	where a.booknum = b.bnum;
--이렇듯, 조건에 맞지 않는 레코드의 데이터도 출력해야 하는 상황에 사용하는 것이 outer join. 
--(+)로 표현
select a.booknum, a.subject, b.rentdate from booklist a, rentlist b
	where a.booknum = b.bnum(+);
	
	
--emp 테이블에는 deptno가 40인 레코드가 하나도 없다. 따라서 join된 결과에는 40번 부서의 이름도, loc도 표시되지 않는다.
select * from emp a, dept b where a.deptno(+)=b.deptno;



--ANSI join 



--1. ANSI inner join

--비교를 위한 일반 inner join
select a.ename, b.dname
from emp a, dept b
where a.deptno = b.deptno;

--ANSI inner join 
select ename, dname
from emp inner join dept on emp.deptno = dept.deptno;

--비교하고자 하는 (서로 다른 두 테이블의) 필드명이 같은 경우 using을 사용하여 묶을 수도 있다
select ename, dname
from emp inner join dept using (deptno);


--2. ANSI outer join

--비교를 위한 일반 outer join
select*from emp, dept
where emp.deptno(+) = dept.deptno;

select*from rentlist, booklist
where rentlist.bnum(+) = booklist.booknum;

--ANSI outer join 방식
select*from emp right outer join dept on emp.deptno = dept.deptno;
--inner join도 이렇게도 표현 가능
select*from emp right outer join dept using (deptno);

select*from rentlist right outer join booklist on rentlist.bnum = booklist.booknum;


