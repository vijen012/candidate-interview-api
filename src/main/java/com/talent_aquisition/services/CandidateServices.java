package com.talent_aquisition.services;

import com.talent_aquisition.entities.Candidate;
import com.talent_aquisition.entities.Interview;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CandidateServices {
	List<Candidate> getresumes();
	Candidate postresumes(Candidate candidate);
	List<Interview> GetCandidateInterview(int cid);
	List<String> resultOut(int cid, int iid);
	//List<Interview> GetCandidateInterview1(int cid);
	List<Candidate> scheduleInterview(int candidate_id, int interview_id);
}
