package com.recruitmentagency.talentacquisition.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Candidate {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	private long mobileNumber;
	private String address;
	private String skills;
	private String education;
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinTable(
			name = "candidate_interview",
			joinColumns = @JoinColumn(name="candidate_id"),
			inverseJoinColumns = @JoinColumn(name="interview_id"))
	private Set<Interview> interview;
	
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candidate(int id, String name, long mobileNumber, String address, String skills, String education) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.skills = skills;
		this.education = education;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public Set<Interview> getInterview(){
		return interview;
	}
	public void setInterview(Set<Interview> interview) {
		this.interview = interview;
	}

	public Candidate(Set<Interview> interview) {
		super();
		this.interview = interview;
	}
	public Set<Interview> setInterviews(Interview interviews){
		interview.add(interviews);
		return interview;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", address=" + address
				+ ", skills=" + skills + ", education=" + education + "]";
	}
}
