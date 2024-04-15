create table fieldlv(
	f1 number(10) primary key,
	f2 number(10)
);

create table tablelv(
	f1 number(10),
	f2 number(10),
	constraint tablepk primary key (f1)
);


alter table fieldlv modify f1 number(10);
alter table tablelv drop constraint tablepk;