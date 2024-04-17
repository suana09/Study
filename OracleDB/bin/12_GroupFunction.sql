--12_GroupFunction.sql

--테이블 내에서 하나의 필드값을 전제로 하는 함수


--합계 (sum)
select sum(inprice) as "입고가격 합계" from booklist;

select sum(rentprice) as "대여가격 합계" from booklist;
select sum(rentprice) as "대여가격 합계" from booklist where inprice>=20000;


--갯수 (count)
select count(*) as "회원수" from memberlist; -- ()안에 * 를 넣으면 모든 레코드의 갯수를 표시
select count (*) as "회원수" from memberlist where bpoint>=100;


--평균 (avg)
select avg (inprice) as "입고가격 평균" from BOOKLIST;
select round(avg (inprice), 0) as "입고가격 평균" from BOOKLIST; --소수점 반올림해서 정수로 표현
--to_char 의 결과값은 숫자>문자로 변경된 것이므로 숫자로서의 기능 상실 -> 다른 숫자와 계산 불가
--계산이 필요하다면 round()를 쓸 것
select to_char(avg (inprice), '999,999,999') as "입고가격 평균" from BOOKLIST; --소수점에 점찍어서 표현


--최대값 (max)
--sequence에 의해 추가된 자동 증가번호를 조회할 때 많이 사용 (최대값이 가장 최근에 추가된 레코드)
select max(inprice) from booklist;


--최소값 (min)
select min(inprice) from booklist;


--group by
--그룹함수의 결과물을 다른 필드의 그룹으로 재구성
select count(*) as "총 대여건수" from rentlist;


--도서별 대여건수
select bnum as "도서번호", count (*) as "도서별 대여건수", sum(discount) as "할인금액 합계"
from rentlist group by bnum;


--rentlist 테이블에서 대여일자 (rentdate) 별 대여건수와 할인금액 평균
select rentdate as 대여일자, count(*) as 대여건수
from rentlist group by rentdate order by rentdate desc;


--having
--그룹핑된 내용들에 조건을 붙일 때
select rentdate as 대여일자, count(*) as 대여건수, avg(discount) as "할인금액 평균"
from rentlist 
group by rentdate 
having avg(discount) >= 50
order by rentdate desc;



