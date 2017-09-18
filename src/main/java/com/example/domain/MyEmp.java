package com.example.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tbl_emp")
@Data
public class MyEmp {
	
	public enum Gender {
		M, m, f, F;
	}
	@Id
	private BigInteger empno;
	private String ename;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String job;
	private Integer mgr;
	private Date hiredate;
	private BigDecimal sal;
	private BigDecimal comm;
	private BigInteger deptno;	
}
