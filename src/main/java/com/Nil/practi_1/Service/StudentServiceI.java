package com.Nil.practi_1.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Nil.practi_1.Model.Student;

public interface StudentServiceI {
	
	public Student SaveStudent(Student stu);
	
	public List<Student> saveAll(List<Student>lists);
	
	public List<Student> GetsaveAll();
	
	public Student getStudentQP(int sid);
	
	public Student getStudentPP(int sid);
	
	public List<Student> GetAllrecordMPK(List<Integer>ids);
	
	public Student getStuByIdfindBymethod(int sid);
	
	public Student getStuBySnameFindByMethod(String sname);
	
	public Student GetStuBySaddfindByMethod(String sadd);
	
	public Student GetStuBySrankfindBySrank(String srank);
	
	public Student getStuBysnameandsadd(String sname, String sadd);
	
	public Student GEtStuSnameOrSadd(String sname, String sadd);
	
	public List<Student> getAllRecordSrankBetween(String srank, String srank1);
}
