--11_Function.sql

--[1] 샘플 테이블인 dual 테이블
select * from tab;
select * from dual;


--[2] 임시 데이터 출력 
select 1234*1234 from dual;





-- *** 문자열 처리 관련 함수 ***


--lower(), upper(), initcap()
select lower ('Hong Gil Dong') as 소문자 from dual;

select upper ('Hong Gil Dong') as 대문자 from dual;

select initcap ('hong gil dong') as "첫글자만 대문자" from dual;

select lower (ename) as "이름" from emp;
select empno, upper (ename) as 이름, job as 이름 from emp;


--이어붙이기 concat() : 문자열 연결
select concat('하이미디어 IT', '아카데미'), '하이미디어 IT' || '아카데미' from dual;
select concat(empno, ename) from emp;

--substr() : 문자열 추출 (데이터, 인덱스(1), 카운트)
select substr('홍길동 만세', 2, 4) from dual; --길동 만
--자바의 substring처럼 시작번째부터 끝번째+1 이 아니라
--시작번째부터의 글자수를 나타냄.
--위의 예시의 경우 2번째 글자부터 4글자를 표시 > '길', '동', ' ', '만'



-- *** 날짜 처리 관련 함수 ***
--sysdate : 날짜
select sysdate from dual; --오늘 날짜의 현재 시간
--insert 명령이나 현재 날짜+시간이 필요한 곳에 폭넓게 사용됨
insert into rentlist(rentdate, numseq) values (sysdate, rent_seq.nextVal);

--months between(): 개월수 차이 구하기
select floor (months_between ('2021-12-31', '2024-04-16')) as "개월수" from dual;

--add_months() : 개월 수 더하기
select add_months(sysdate, 20) from dual; // 2025-12-16 15:48:36.0

--next_day() : 대입한 날짜에서 가장 가까운 대입한 요일의 날짜
select next_day(sysdate, '일요일') from dual; --오늘 날짜에서 가장 가까운 일요일

--last_day() : 해당 달의 마지막 날짜
select last_day(sysdate) from dual;
select last_day('2020-12-15') from dual;



--to_char() : 문자 (String)으로 변환	Date -> varchar2
select to_char(sysdate, 'yyyy-mm-dd') as "Date -> String" from dual;
--select와 from 사이에서 많이 사용되는 함수

--숫자 -> 문자 세자리마다 컴마를 넣어서 변환
select to_char(123456789, '999,999,999') from dual; --  123,456,789

--to_date() : 날짜형(Date) 로 변환		varchar2 -> Date
select to_date('2019/12/31', 'yyyy/mm/dd') as "String -> Date" from dual;
--insert 명령에서 values로 값을 넣을 때 많이 사용되는 함수

--to_number() : 숫자(number)로 변환
--여섯자리 문자를 숫자로 변환
select to_number ('123456') from dual;

--yyyy -> 년도 표시
select to_char(sysdate, 'yy"년"') from dual; -- -> 24년
select to_char(sysdate, 'y"년"') from dual; -- -> 4년

--month, mon -> 월 표시
select to_char(sysdate, 'month') from dual; --4월
select to_char(sysdate, 'mon') from dual; --4월
select to_char(sysdate, 'mm') from dual; --04
select to_char(sysdate, 'mm"월"') from dual; --04월

--dd : 일자를 01~31로 표시
select to_char(sysdate, 'dd') from dual; --16
--ddd : 일자를 001~365 형태로 표시
select to_char(sysdate, 'ddd') from dual; --107
--dl: 오늘 날짜를 요일까지 표시
select to_char(sysdate, 'dl') from dual; -- 2024년 4월 16일 화요일

--round() : 반올림
select round(12.34567, 3) from dual;
-- 12.34567: 반올림하려는 대상 숫자 3: 반올림하여 표시하고자 하는 마지막 자리수









