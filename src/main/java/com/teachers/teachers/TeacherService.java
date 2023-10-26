package com.teachers.teachers;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
	@Autowired
	private TeacherDAORepository TeacherDAORepository;
	
	public List<Teacher> getTeacher(){
		List<Teacher> teacherList = new ArrayList<Teacher>();
		TeacherDAORepository.findAll().forEach(teacherList::add);
		return teacherList;
}
	
	public Optional<Teacher> getTeacher(String id) {
		return TeacherDAORepository.findById(id);
	}
	
	public void updateTeacher(String id, Teacher Teacher) {
		TeacherDAORepository.save(Teacher);
	}

	public void deleteTeacher(String id) {
		TeacherDAORepository.deleteById(id);
	}

	
	public void addTeacher(Teacher Teacher) {
		TeacherDAORepository.save(Teacher);
	}

}
