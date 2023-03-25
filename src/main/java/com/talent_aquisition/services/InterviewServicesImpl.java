package com.talent_aquisition.services;

import com.talent_aquisition.dao.InterviewRepository;
import com.talent_aquisition.entities.Interview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InterviewServicesImpl implements InterviewServices {
	
	@Autowired
	private InterviewRepository interviewrepository;

	@Override
	public List<Interview> getinterview(){
		return (List<Interview>) interviewrepository.findAll();
	}
	
	
	public Interview addinterview(Interview interview) {
		interviewrepository.save(interview);
		return interview;
	}
	
	@Override
	public List<Interview> outcomeInterview(int id, String outcome){
		List<Interview> interviewRecords = new ArrayList<>();
		Interview ie = interviewrepository.findById(id).get();
		ie.setName(outcome);
		interviewrepository.save(ie);
		interviewrepository.findAll().forEach(interviewRecords::add);
		return interviewRecords;
		
	}
}
