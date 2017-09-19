package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tbl_member")
public class Member {
	// AUTO: DB에 종속적으로 방식 수행(MySQL -> IDENTITY, Oracle -> SEQUENCE)
	// IDENTITY: MySQL에 최적화된 Auto Increment 방식(Oracle)
	// SEQUENCE: Oracle에 최적화된 방식 
	// TABLE: 별도로 테이블을 생성해서 채번함
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String pw;
	private String name;

}
