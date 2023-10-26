package com.teachers.teachers;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Teacher {

	@Id
	
	private String id;
	
	private String teacherName;
	private String subject;
	private String handlingclasses;
	
	public Teacher() {
		super();
		
	}
	
	public Teacher(String id, String teacherName, String subject, String handlingclasses) {
		super();
		this.id = id;
		this.teacherName = teacherName;
		this.subject = subject;
		this.handlingclasses = handlingclasses;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getHandlingclasses() {
		return handlingclasses;
	}
	public void setHandlingclasses(String handlingclasses) {
		this.handlingclasses = handlingclasses;
	}
    
}
