package com.example.repository;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.MyDept;
import com.example.domain.MyEmp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyDeptRepositoryTest {

	@Inject
	MyDeptRepository deptRepository;
	
	@Inject
	MyEmpRepository empRepository;
	
	@Test
	@Transactional
	public void testDeptAll() {
		System.out.println(deptRepository.getClass());
		
		MyDept dept = new MyDept();
		dept.setDeptno(10);
		Example<MyDept> example = Example.of(dept);
		deptRepository.findAll(example).forEach(e -> {
			System.out.println(e);
//			System.out.println(e.getEmps());
		});

	}
	
	@Test
	@Transactional
	public void testEmpAll() {
		System.out.println(empRepository.getClass());		

		Optional<MyEmp> e = empRepository.findById(1001);
		MyEmp emp = e.get();
		System.out.println(emp);
		
//		empRepository.findAll().forEach(e -> {
//			System.out.println(e);
//		});
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
