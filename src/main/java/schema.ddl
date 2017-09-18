
    create table tbl_dept (
       deptno number(10,0) not null,
        dname varchar2(255 char),
        loc varchar2(255 char),
        primary key (deptno)
    );

    create table tbl_emp (
       empno number(19,2) not null,
        comm number(19,2),
        deptno number(19,2),
        ename varchar2(255 char),
        gender number(10,0),
        hiredate timestamp,
        job varchar2(255 char),
        mgr number(10,0),
        sal number(19,2),
        primary key (empno)
    );

    create table tbl_dept (
       deptno integer not null,
        dname varchar(255),
        loc varchar(255),
        primary key (deptno)
    ) engine=InnoDB;

    create table tbl_emp (
       empno decimal(19,2) not null,
        comm decimal(19,2),
        deptno decimal(19,2),
        ename varchar(255),
        gender integer,
        hiredate datetime,
        job varchar(255),
        mgr integer,
        sal decimal(19,2),
        primary key (empno)
    ) engine=InnoDB;

    create table tbl_dept (
       deptno integer not null,
        dname varchar(255),
        loc varchar(255),
        primary key (deptno)
    ) engine=InnoDB;

    create table tbl_emp (
       empno decimal(19,2) not null,
        comm decimal(19,2),
        deptno decimal(19,2),
        ename varchar(255),
        gender integer,
        hiredate datetime,
        job varchar(255),
        mgr integer,
        sal decimal(19,2),
        primary key (empno)
    ) engine=InnoDB;

    create table tbl_dept (
       deptno integer not null,
        dname varchar(255),
        loc varchar(255),
        primary key (deptno)
    ) engine=InnoDB;

    create table tbl_emp (
       empno decimal(19,2) not null,
        comm decimal(19,2),
        deptno decimal(19,2),
        ename varchar(255),
        gender integer,
        hiredate datetime,
        job varchar(255),
        mgr integer,
        sal decimal(19,2),
        primary key (empno)
    ) engine=InnoDB;

    create table tbl_member (
       uid varchar(255) not null,
        uname varchar(255),
        upw varchar(255),
        primary key (uid)
    ) engine=InnoDB;

    create table tbl_profile (
       fno bigint not null auto_increment,
        current bit not null,
        fname varchar(255),
        primary key (fno)
    ) engine=InnoDB;

    create table tbl_dept (
       deptno number(10,0) not null,
        dname varchar2(255 char),
        loc varchar2(255 char),
        primary key (deptno)
    );

    create table tbl_emp (
       empno number(19,2) not null,
        comm number(19,2),
        deptno number(19,2),
        ename varchar2(255 char),
        gender number(10,0),
        hiredate timestamp,
        job varchar2(255 char),
        mgr number(10,0),
        sal number(19,2),
        primary key (empno)
    );

    create table tbl_member (
       uid varchar2(255 char) not null,
        uname varchar2(255 char),
        upw varchar2(255 char),
        primary key (uid)
    );
