package com.example.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_emp")
public class MyEmp {
	
	public enum Gender {
		M, m, f, F;
	}
	@Id
	private BigInteger empno;
	private String ename;
	private Gender gender;
	private String job;
	private Integer mgr;
	private Date hiredate;
	private BigDecimal sal;
	private BigDecimal comm;
	private BigInteger deptno;	
}
