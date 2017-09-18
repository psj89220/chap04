package com.example.repository;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.MyEmp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyDeptRepositoryTest {

	@Inject
	MyDeptRepository deptRepository;
	
	@Inject
	MyEmpRepository empRepository;
	
	@Test
	public void test() {
		System.out.println(deptRepository.getClass());
		System.out.println(empRepository.getClass());
		
		deptRepository.findAll().forEach(e -> {
			System.out.println(e);
		});
		empRepository.findAll().forEach(e -> {
			System.out.println(e);
		});
	}
	
	@Test
	public void test2() {
		List<MyEmp> emp = empRepository.findByEname("김사랑");
		emp.forEach(e -> {
			System.out.println(e);
		});
	}
	
	@Test
	public void test3() {
		List<MyEmp> emps = empRepository.queryMgrByEname("김사랑");
		emps.forEach(e -> {
			System.out.println(e);
		});
	}

}
