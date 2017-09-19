package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="tbl_profile")
@AllArgsConstructor
@NoArgsConstructor
public class Profile {
	@Id
	@TableGenerator(name="idGen", table="id_gen", initialValue=1000, allocationSize=100)
	@GeneratedValue(strategy = GenerationType.TABLE, generator="idGen")
	private Long fno;
	private String fname;
	
	private boolean curr;

}
