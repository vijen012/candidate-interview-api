package com.recruitmentagency.talentacquisition.controller;

import com.recruitmentagency.talentacquisition.entities.Candidate;
import com.recruitmentagency.talentacquisition.entities.Interview;
import com.recruitmentagency.talentacquisition.services.CandidateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CandidateController {
	@Autowired
	private CandidateServices candidateservices;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to our Home Page";
	}
	@GetMapping("/resume")
	public List<Candidate> getresumes() {
		return this.candidateservices.getresumes();
	}
	@PostMapping("/resume")
	public Candidate postresumes(@RequestBody Candidate candidate) {
		return this.candidateservices.postresumes(candidate);
	}
	
	@GetMapping("/schedule")
	public List<Candidate> scheduleInterview(@RequestBody Map<String, String> input){
		candidateservices.scheduleInterview(Integer.parseInt(input.get("candidate_id")), Integer.parseInt(input.get("interview_id")));
		return this.candidateservices.getresumes();
	}
	@RequestMapping("/result")
	public List<String> resultOut(@RequestBody Map<String, String> res){
		return this.candidateservices.resultOut(Integer.parseInt(res.get("candidate_id")), Integer.parseInt(res.get("interview_id")));
	}
	
	@RequestMapping("/candidateinterview/{cid}")
	public List<Interview> GetCandidateInterview(@PathVariable int cid){
		return candidateservices.GetCandidateInterview(cid);
	}
	
	

}
