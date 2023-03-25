package com.recruitmentagency.talentacquisition.services;

import com.recruitmentagency.talentacquisition.dao.CandidateRepository;
import com.recruitmentagency.talentacquisition.dao.InterviewRepository;
import com.recruitmentagency.talentacquisition.entities.Candidate;
import com.recruitmentagency.talentacquisition.entities.Interview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CandidateServicesImpl implements CandidateServices {
	
	@Autowired
	CandidateRepository candidaterepository;

	@Autowired
	InterviewRepository interviewrepository;
	
	@Override
	public List<Candidate> getresumes(){
		return (List<Candidate>) candidaterepository.findAll();
	}
	@Override
	public Candidate postresumes(Candidate candidate) {
		candidaterepository.save(candidate);
		return candidate;
	}
	
	
	
	@Override
	public List<Interview> GetCandidateInterview(int cid){
		Candidate ce = candidaterepository.findById(cid).get();
		List<Interview> candidateinterview = new ArrayList<>(ce.getInterview());
		return candidateinterview;
	}
	
	@Override
	public List<Candidate> scheduleInterview(int candidate_id,int interview_id){
		List<Candidate>  candidateRecords = new ArrayList<>();
		Candidate cd = candidaterepository.findById(candidate_id).get();
		Interview iv = interviewrepository.findById(interview_id).get();
		iv.addCandidates(cd);
		candidaterepository.save(cd);
		interviewrepository.save(iv);
		candidaterepository.findAll().forEach(candidateRecords::add);
		return candidateRecords;
		

	}
	@Override
	public List<String> resultOut(int cid, int iid){
		String cname;
		long c_mobileno;
		String c_address;
		String c_skills;
		String c_education = null;
		
		List<String> str = new ArrayList<>();
		str.add("Id : " + Integer.toString(cid));
		
		Candidate ce = candidaterepository.findById(cid).get();
		cname=ce.getName();
		str.add("Name " + cname);
		c_mobileno = ce.getMobileNumber();
		str.add("Mobile Number : " + Long.toString(c_mobileno));
		c_address = ce.getAddress(); 
		str.add("Education : " + c_education);
		List<Interview> candidateinterview = new ArrayList<>(ce.getInterview());
		String outcome = "";
		for(int i=0;i<candidateinterview.size();i++) {
			if(candidateinterview.get(i).getId() == iid) {
				if(candidateinterview.get(i).getName().equals(Integer.toBinaryString(cid))){
					outcome = "Passed the Interview";
				}
				else {
					outcome = "Failed the Interview";
				}
				
			}
			else {
				outcome = "Candidate has not scheduled this interview";
			}
		}
		str.add(outcome);
		return str;
	}
		
}
