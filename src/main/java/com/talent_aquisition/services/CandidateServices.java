package com.talent_aquisition.services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.talent_aquisition.entities.Candidate;
import com.talent_aquisition.entities.Interview;

import jakarta.transaction.Transactional;

@Service
public interface CandidateServices {
	public List<Candidate> getresumes();
	public Candidate postresumes(Candidate candidate);
	
	public List<Interview> GetCandidateInterview(int cid);
	public List<String> resultOut(int cid, int iid);

	//List<Interview> GetCandidateInterview1(int cid);

	public List<Candidate> scheduleInterview(int candidate_id, int interview_id);

}
