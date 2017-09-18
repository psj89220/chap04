package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tbl_dept")
@Data
public class MyDept {
	@Id
	Integer deptno;
	String dname;
	String loc;
}
