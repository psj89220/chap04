package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_dept")
public class MyDept {
	@Id
	Integer deptno;
	String dname;
	String loc;
}
