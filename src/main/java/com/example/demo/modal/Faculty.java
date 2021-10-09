package com.example.demo.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	private String  Facultyname;
	private String  Qualification;
	private Integer  Experience;
	private String  Skillset;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getFacultyname() {
		return Facultyname;
	}
	public void setFacultyname(String facultyname) {
		Facultyname = facultyname;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public Integer getExperience() {
		return Experience;
	}
	public void setExperience(Integer experience) {
		Experience = experience;
	}
	public String getSkillset() {
		return Skillset;
	}
	public void setSkillset(String skillset) {
		Skillset = skillset;
	}
}
