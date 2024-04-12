--08.DML_Select.sql
--
--오라클 명령어 : select 문 (검색)
--가장 사용빈도수가 높은 명령
--
--[1] scott 사용자가 관리하고 있는 테이블 목록
select*from tab;
select*from tabs;

--[2] 특정 테이블의 구조 조회 (필드 리스트/ 데이터 형식)
desc booklist; --커맨드창 (sqlplus)에서 확인 요망
desc memberlist; --커맨드창 (sqlplus)에서 확인 요망

--[3] 테이블의 제약사항 조회
select*from user_constraints;	--모든 제약사항
select*from user_constraints where table_name = 'RENTLIST'; --특정테이블의 제약사항, 테이블명은 대문자로 적어주어야 함
select*from user_constraints where table_name = 'BOOKLIST'; 
select*from user_constraints where table_name = 'MEMBERLIST';
--
--SELECT의 사용법
--select : select와 from 사이에 조회하고자 하는 필드명들을 ,로 구분하여 나열
select booknum, subject, rentprice from booklist;
--모든 필드를 한번에 지목하려면 * 을 작성 --select * from...
--from 뒤에는 대상 테이블 명 작성
--where절을 붙여 조건에 맞는 행만 골라낼 수 있다
select 필드명들 또는 * from 테이블명 where 검색조건;

select subject, makeyear from booklist where (makeyear>=2022);
select * from booklist; --검색조건 없이 모든 필드를 다 조회하여 열람

--필드의 항목끼리의 연산 결과도 조회 대상이 될 수 있음
select rentprice - inprice from booklist;
select rentprice - inprice as margin from booklist; --연산 결과에 이름을 붙여 조회할 수 있다 
select subject as 제목, rentprice*10 - inprice as 마진 from booklist;
select subject as "도서 제목", rentprice*10 - inprice as "10회대여 마진" from booklist; --" " 를 붙이면 띄어쓰기 가능
select booknum || '-' || subject as "book info" from booklist;
--오라클 SL에서 ||는 이어붙이기 연산. (concat처럼..?)




--distinct : 중복 제거
select bnum as "대여도서 번호" from rentlist;
select distinct bnum as "대여도서 번호" from rentlist; --결과에서 중복을 제외



--함수의 사용
select avg(inprice) as "입고가격 평균" from booklist;

select*from booklist;

--검색조건: update와 delete에서 사용하던 where와 사용방식 같음

--memberlist 테이블에서 이름이 '바오'로 끝나는 회원의 모든 회원정보 출력
select name from memberlist where name like '%바오';
--memberlist 테이블에서 2020년도 이후로 태어난 회원의 모든 회원정보 출력
select * from memberlist where birth>= '2021-01-01';

--booklist 테이블에서 제작년도가 2022년 이전이거나 입고가격 (inprice) 이 18000원 이하인 도서의 모든 도서정보 출력
select*from booklist where (makeyear<2022 or inprice<=18000);

--booklist 테이블에서 도서 제목의 두번째 글자가 '것'인 도서의 모든 도서정보 출력
select * from booklist where subject like '_것%';


select*from emp;
select*from dept;



--in any some all

--부서번호가 10, 20, 30인 사원들의 모든 필드 조회
--방법 01)
select * from emp where deptno = 10 or deptno = 20 or deptno = 30;

--방법02)
select*from emp where deptno <> 40; -- <> 는 =/=와 동일, 40이 아닐 때 

--방법03)
select*from emp where deptno in (10, 20, 30);



--1. any
select * from emp where deptno = any (10, 20, 40);
--any(): 괄호안에 나열된 내용 중 어느하나라도 해당하는것이 있다면 검색 대상으로 함
--in과 유사, = 의 사용여부가 차이점

--2. some 조건식 			: any와 동일
select * from emp where deptno = some (10, 20, 40);

--3. all
select * from emp where deptno = all(10, 20, 40);
--괄호안의 모든값이 동시에 만족해야하는 조건이므로 해당하는 레코드가 없을때가 대부분. 사용빈도수가 현저히 낮다

select*from emp where deptno <> all(10, 20, 40);
--위와 같이 구성내용과 모두 같지 않을 때를 조건으로 필터링할 때 자주 사용.

select*from emp where deptno not in (10, 20, 40);





--그 외 활용하기 좋은 select 에 대한 예제
--부서번호가 10이 아닌 사원 (아래 두 문장은 같은 의미의 명령임)
select*from emp where NOT (deptno = 10);
select*from emp where deptno <> 10;

--급여가 1000달러 이상, 3000달러 이하
select*from emp where sal>=1000 and sal<=3000;
select*from emp where sal between 1000 and 3000;

--사원의 연봉 출력
select deptno, ename, sal*12 as 연봉 from emp;





------------------------------------------------------------------------------------------------------------



--
--정렬(Sort) - where 구문 뒤에, 또는 구문의 맨 끝에 Order by 필드명 [desc]
--select 명령의 결과를 특정 필드값의 오름차순 이나 내림 차순으로 정렬하라는 명령.
-- asc :오름차순 정렬, 쓰지 않으면 기본 오름차순 정렬로 실행됨
-- desc: 내림차순 정렬, 내림 차순 정렬을 위해서는 반드시 필드명 뒤에 써야하는 키워드




--emp 테이블에서
-- sal이 1000 이상인 데이터를 ename 의 오름차순으로 정렬하여 조회 
select * from emp where sal>=1000 order by ename;  --오름차순일때 asc 는 생략 가능
--sal이 1000 이상인 데이터를 ename 의 내림차순으로 정렬하여 조회 
select * from emp where sal>=1000 order by ename desc;

--job으로 내림차순 정렬 후 같은 job_id 사이에서는 순서를 hiredate 의 내림차순으로 정렬
select*from emp order by job desc, hiredate desc;
--두 개 이상의 정렬기준이 필요할 때는 위와 같이 컴마로 구분하여 두가지 기준을 지정해주며,
--위의 예제의 경우 job으로 1차 내림차순 정렬 후 > job 값이 같은 레코드들 사이에서 hiredate를 기준으로 내림차순 정렬을 해 줌 
