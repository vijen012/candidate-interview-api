package com.talent_aquisition.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.talent_aquisition.entities.Interview;

@Service
public interface InterviewServices {
	public List<Interview> getinterview();
	public Interview addinterview(Interview interview);
	public List<Interview> outcomeInterview(int id, String outcome);
}
