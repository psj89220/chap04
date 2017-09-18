package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.domain.MyEmp;

public interface MyEmpRepository extends JpaRepository<MyEmp, Integer> {
	List<MyEmp> findByEname(String ename);
	
	@Query("select m "
			+ "from MyEmp e inner join MyEmp m "
			+ "on m.empno = e.mgr "
			+ "where e.ename = :ename")
	List<MyEmp> queryMgrByEname(@Param("ename") String ename); 
}
