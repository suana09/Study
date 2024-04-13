create table student(
	student_id number(8),
	name varchar2(30),
	email varchar2(45),
	
	constraint student_pk primary key (student_id) 
)

create table studentgrade(
	g_id number(8),
	gradenum number(8),
	point number(5, 2),
	
	constraint g_fk foreign key (g_id) references student(student_id)	
)


insert into STUDENT values (000, '푸바오', 'fubao@gmail.com');
insert into STUDENT values (001, '아이바오', 'aibao@gmail.com');
insert into STUDENT values (002, '러바오', 'lebao@gmail.com');
insert into STUDENT values (003, '루이바오', 'ruibao@gmail.com');
insert into STUDENT values (004, '후이바오', 'fuibao@gmail.com');

insert into STUDENTGRADE values (000, 2, 80);
insert into STUDENTGRADE values (001, 1, 95);
insert into STUDENTGRADE values (002, 2, 85);
insert into STUDENTGRADE values (003, 3, 65);
insert into STUDENTGRADE values (004, 3, 60);

update student set email = 'huibao@gmail.com' where name like '후이%';

select*from student;
select*from studentgrade;

select *
	from student a, studentgrade b
	where a.student_id = b.g_id;
	
	
	
create table student2(
	student_id number(8),
	name varchar2(30),
	email varchar2(45),
	
	constraint student_pk2 primary key (student_id) 
);

create table studentgrade2(
	g_id number(8),
	point number(5, 2),
	constraint g_fk2 foreign key (g_id) references student2(student_id)	
);

create table grade(
	grade_name varchar2(4),
	grade_hi number(8),
	grade_low number(8)
);

insert into STUDENT2 values (000, '푸바오', 'fubao@gmail.com');
insert into STUDENT2 values (001, '아이바오', 'aibao@gmail.com');
insert into STUDENT2 values (002, '러바오', 'lebao@gmail.com');
insert into STUDENT2 values (003, '루이바오', 'ruibao@gmail.com');
insert into STUDENT2 values (004, '후이바오', 'huibao@gmail.com');

insert into STUDENTGRADE2 values (000, 80);
insert into STUDENTGRADE2 values (001, 95);
insert into STUDENTGRADE2 values (002, 85);
insert into STUDENTGRADE2 values (003, 75);
insert into STUDENTGRADE2 values (004, 70);



insert into grade values ('A', 100, 90);
insert into grade values ('B', 89, 80);
insert into grade values ('C', 79, 70);

select a.name, c.grade_name, b.point
	from student2 a, studentgrade2 b, grade c
	where ((a.student_id = b.g_id) and (b.point between c.grade_low and c.grade_hi));

	
select *
from student2
inner join studentgrade2
on student2.student_id = studentgrade2.g_id;

--일반
select *
from student2 a, studentgrade2 b
where a.student_id(+) = b.g_id;

--ANSI
select *
from student2
inner join studentgrade2
on student2.student_id(+) = studentgrade2.g_id;


create or replace view studentgradeinfo as
select a.name, c.grade_name, b.point
	from student2 a, studentgrade2 b, grade c
	where ((a.student_id = b.g_id) and (b.point between c.grade_low and c.grade_hi));
	

select*from studentgradeinfo;
select name from studentgradeinfo;
