package com.Nil.practi_1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nil.practi_1.Model.Student;
import com.Nil.practi_1.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student SaveStudent(Student stu) {
		Student save = studentRepository.save(stu);
		return save;
	}

	@Override
	public List<Student> saveAll(List<Student> lists) {
		List<Student> saveAll = (List<Student>) studentRepository.saveAll(lists);
		return saveAll;
	}

	@Override
	public List<Student> GetsaveAll() {
		List<Student> all = (List<Student>) studentRepository.findAll();
		return all;
	}

	@Override
	public Student getStudentQP(int sid) {
		Student student = studentRepository.findById(sid).get();
		return student;
	}

	@Override
	public Student getStudentPP(int sid) {
		Student student1 = studentRepository.findById(sid).get();
		
		return student1;
	}

	@Override
	public List<Student> GetAllrecordMPK(List<Integer> ids) {
		List<Student> allById = (List<Student>) studentRepository.findAllById(ids);
		return allById;
	}

	@Override
	public Student getStuByIdfindBymethod(int sid) {
		Student bySid = studentRepository.findBySid(sid);
		return bySid;
	}

	@Override
	public Student getStuBySnameFindByMethod(String sname) {
		Student findbySname = studentRepository.findBySname(sname);
		return findbySname;
	}

	@Override
	public Student GetStuBySaddfindByMethod(String sadd) {
		Student bySadd = studentRepository.findBySadd(sadd);
		return bySadd;
	}

	@Override
	public Student GetStuBySrankfindBySrank(String srank) {
		Student bySrank = studentRepository.findBySrank(srank);
		return bySrank;
	}

	@Override
	public Student getStuBysnameandsadd(String sname, String sadd) {
		Student bySnameAndSadd = studentRepository.findBySnameAndSadd(sname, sadd);
		return bySnameAndSadd;
	}

	@Override
	public Student GEtStuSnameOrSadd(String sname, String sadd) {
		Student bySnameOrSadd = studentRepository.findBySnameOrSadd(sname, sadd);
		return bySnameOrSadd;
	}

	@Override
	public List<Student> getAllRecordSrankBetween(String srank, String srank1) {
		List<Student> bySrankBetween = studentRepository.findBySrankBetween(srank, srank1);
		
		return bySrankBetween;
	}

	



	
};
