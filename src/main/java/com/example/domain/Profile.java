package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tbl_profile")
public class Profile {
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long fno;
	private String fname;
	
	private boolean current2;

}
