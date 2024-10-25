package com.Nil.practi_1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Nil.practi_1.Controller.StudentController;
import com.Nil.practi_1.Model.Student;

@SpringBootApplication
public class Practi1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context = SpringApplication.run(Practi1Application.class, args);
		StudentController primary = Context.getBean(StudentController.class);
		
		
//		Student stu= new Student();
		
		
//		stu.setSid(7);
//		stu.setSname("pranali");
//		stu.setSadd("Amalner");
//		stu.setSrank("Seven");
//		Student saveStudent = primary.SaveStudent(stu);
//		System.out.println(saveStudent);
		
//		stu.setSid(8);
//		stu.setSname("reva");
//		stu.setSadd("Surat");
//		stu.setSrank("eight");
//		
//		Student stu1= new Student();
//		stu1.setSid(9);
//		stu1.setSname("indori isq");
//		stu1.setSadd("Indore");
//		stu1.setSrank("nine");
//		
//		List<Student> l= new ArrayList<Student>();
//		l.add(stu1);
//		l.add(stu);
//		
//		List<Student> saveAllimformation = primary.saveAllimformation(l);
//		System.out.println(saveAllimformation);
		
//		List<Student> getsaveAllRecord = primary.GetsaveAllRecord();
//		System.out.println(getsaveAllRecord);
		
//		Student studentQPPI = primary.getStudentQPPI(1);
//		System.out.println(studentQPPI);
//		
//		Student studentPPPI = primary.getStudentPPPI(3);
//		System.out.println(studentPPPI);
		
		
//		List<Integer> ids= new ArrayList();
//		ids.add(1);
//		ids.add(2);
//		ids.add(3);
//		ids.add(4);
//		ids.add(7);
//		
//		List<Student> getAllrecordMPK = primary.GetAllrecordMPK(ids);
//		System.out.println(getAllrecordMPK);
		
//		Student stuBySIdfindBymethod1 = primary.getStuBySIdfindBymethod(1);
//		Student stuBySIdfindBymethod2 = primary.getStuBySIdfindBymethod(2);
//		Student stuBySIdfindBymethod3 = primary.getStuBySIdfindBymethod(3);
//		Student stuBySIdfindBymethod4 = primary.getStuBySIdfindBymethod(4);
//		Student stuBySIdfindBymethod5 = primary.getStuBySIdfindBymethod(5);
//		Student stuBySIdfindBymethod6 = primary.getStuBySIdfindBymethod(7);
//		List l= new ArrayList();
//		l.add(stuBySIdfindBymethod1);
//		l.add(stuBySIdfindBymethod2);
//		l.add(stuBySIdfindBymethod3);
//		l.add(stuBySIdfindBymethod4);
//		l.add(stuBySIdfindBymethod5);
//		l.add(stuBySIdfindBymethod6);
//		System.out.println(l);
		
	//		Student stuBySnameFindBy = primary.getStuBySnameFindBy("Monali");
	//		System.out.println(stuBySnameFindBy);
		
//		Student getsStuBySaddfindByMethod = primary.GetsStuBySaddfindByMethod("Amalner");
//		Student getsStuBySaddfindByMethod1 = primary.GetsStuBySaddfindByMethod("Nashik");
//		Student getsStuBySaddfindByMethod2 = primary.GetsStuBySaddfindByMethod("Surat");
//		Student getsStuBySaddfindByMethod3 = primary.GetsStuBySaddfindByMethod("Ranjane");
		
//		List l= new ArrayList();
//		l.add(getsStuBySaddfindByMethod3);
//		l.add(getsStuBySaddfindByMethod2);
//		l.add(getsStuBySaddfindByMethod1);
//		l.add(getsStuBySaddfindByMethod);
//		System.out.println(l);
		
//		Student getStuBysSrankfindBySrank = primary.GetStuBysSrankfindBySrank("four");
//		Student getStuBysSrankfindBySrank1= primary.GetStuBysSrankfindBySrank("Two");
//		Student getStuBysSrankfindBySrank2 = primary.GetStuBysSrankfindBySrank("five");
//		Student getStuBysSrankfindBySrank3 = primary.GetStuBysSrankfindBySrank("seven");
		
//		List l= new ArrayList();
//		l.add(getStuBysSrankfindBySrank3);
//		l.add(getStuBysSrankfindBySrank2);
//		l.add(getStuBysSrankfindBySrank1);
//		l.add(getStuBysSrankfindBySrank);
		
//		System.out.println(l);
		
//		Student g = primary.getsStuBysnameandsadd("rain", "ranjane");
//		Student g1 = primary.getsStuBysnameandsadd("kushal", "Surat");
//		Student g2= primary.getsStuBysnameandsadd("pranali", "Amalner");
//		List  l=new ArrayList();
//		l.add(g);
//		l.add(g1);
//		l.add(g2);
	
//		System.out.println(l);
		
//		Student gEtSstuSnameOrSadd = primary.GEtSstuSnameOrSadd("pranali", "a");
//		System.out.println(gEtSstuSnameOrSadd);
		
		List<Student> allRecordSrankBetween = primary.getsAllRecordSrankBetween("first", "six");
		System.out.println(allRecordSrankBetween);
		
	}
	
}
