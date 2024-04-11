--02_DDL.sql
--DDL(Data Definition Language) 데이터 정의어
--테이블의 생성 CREATE

--명령 양식
CREATE TABLE tableName(

--default : 명시적으로 입력하지 않아도 자동으로 들어갈 값
	fieldName1 DATATYPE [DEFAULT 값 OR 제약조건 등...],
	fieldName2 DATATYPE [DEFAULT 값 OR 제약조건 등...]
	fieldName3 DATATYPE [DEFAULT 값 OR 제약조건 등...],
	fieldName4 DATATYPE [DEFAULT 값 OR 제약조건 등...],
	...
	fieldName DATATYPE [DEFAULT 값 OR 제약조건 등...],
);