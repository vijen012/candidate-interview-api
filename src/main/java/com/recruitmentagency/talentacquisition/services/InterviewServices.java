package com.recruitmentagency.talentacquisition.services;

import com.recruitmentagency.talentacquisition.entities.Interview;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InterviewServices {
	public List<Interview> getinterview();
	public Interview addinterview(Interview interview);
	public List<Interview> outcomeInterview(int id, String outcome);
}
