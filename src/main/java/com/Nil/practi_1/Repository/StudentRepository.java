package com.Nil.practi_1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Nil.practi_1.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	public Student findBySid(int Sid);
	
	public abstract Student findBySname(String sname);
	
	public Student findBySadd(String sadd);
	
	public Student findBySrank(String srank);
	
	public Student findBySnameAndSadd(String sname, String sadd);
	
	public Student findBySnameOrSadd(String sname, String sadd);
	
	public List<Student> findBySrankBetween(String srank, String srank1);


}
