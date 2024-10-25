package com.Nil.practi_1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.Nil.practi_1.Model.Student;
import com.Nil.practi_1.Service.StudentServiceI;

@Controller
public class StudentController {
	@Autowired
	private StudentServiceI studentServiceI;
	
	public Student SaveStudent(Student stu) {
		Student saveStudent = studentServiceI.SaveStudent(stu);
		return saveStudent;
		
	}
	
	public List<Student> saveAllimformation(List<Student> lists){
		List<Student> saveAll = studentServiceI.saveAll(lists);
		return saveAll;
		
	}
	
	public List<Student> GetsaveAllRecord(){
		List<Student> getsaveAll = studentServiceI.GetsaveAll();
		return getsaveAll;
		
	}
	
	public Student getStudentQPPI(@RequestParam int sid) {
		Student studentQP = studentServiceI.getStudentQP(sid);
		return studentQP;
		
	}
	public Student getStudentPPPI(@PathVariable int sid) {
		Student studentPP = studentServiceI.getStudentPP(sid);
		
		return studentPP;
		
	}
	public List<Student> GetAllrecordMPK(List<Integer> ids){
		List<Student> getAllrecordMPK = studentServiceI.GetAllrecordMPK(ids);
		return getAllrecordMPK;
		
	}
	public Student getStuBySIdfindBymethod(int sid) {
		
		Student stuByIdfindBymethod = studentServiceI.getStuByIdfindBymethod(sid);
		return stuByIdfindBymethod;
		
	}
	
	public Student getStuBySnameFindBy(String sname) {
		Student stuBySnameFindByMethod = studentServiceI.getStuBySnameFindByMethod(sname);		
		return stuBySnameFindByMethod;		
	}
	
	public Student GetsStuBySaddfindByMethod(String sadd) {
		Student getStuBySaddfindByMethod = studentServiceI.GetStuBySaddfindByMethod(sadd);
		return getStuBySaddfindByMethod;
		
	}
	
	public Student GetStuBysSrankfindBySrank(String srank) {
		Student getStuBySrankfindBySrank = studentServiceI.GetStuBySrankfindBySrank(srank);
		return getStuBySrankfindBySrank;
		
	}
	
	public Student getsStuBysnameandsadd(String sname, String sadd) {
		Student stuBysnameandsadd = studentServiceI.getStuBysnameandsadd(sname, sadd);
		return stuBysnameandsadd;
		
	}
	
	public Student GEtSstuSnameOrSadd(String sname, String sadd) {
		Student gEtStuSnameOrSadd = studentServiceI.GEtStuSnameOrSadd(sname, sadd);
		return gEtStuSnameOrSadd;
		
	}
	
	public List<Student> getsAllRecordSrankBetween(String srank, String srank1){
		List<Student> allRecordSrankBetween = studentServiceI.getAllRecordSrankBetween(srank, srank1);
		
		
		return allRecordSrankBetween;
		
	}
		
}

