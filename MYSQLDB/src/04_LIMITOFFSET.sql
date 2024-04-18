--04_LIMITOFFSET.sql

--select 명령의 결과 레코드가 갯수가 많을 때, 일부만 지목하여 열람 가능
--오라클에서는 rownum이라는 키워드를 이용
--ex) select*from 테이블이름 where rownum >=1 and rownum <=10;



--LIMIT
-- select 로 데이터 조회 할때 조회할 레코드의 갯수를 지정 가능
select * from memberlist order by membernum desc limit 5;
--회원 정보 조회하여 5개의 레코드만 리턴

--OFFSET
--select 로 데이터 조회할때, 맨위에서 부터 offset 에 지정한 번째까지는 뛰어 넘고 그 다음 부터 리턴
select * from memberlist order by membernum desc;
select * from memberlist order by membernum desc limit 5 offset 3;
--3번째 데이터부터 5개의 레코드 리턴, 갯수가 모자라면 있는곳까지 리턴
--offset은 0부터 시작한다