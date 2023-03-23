package com.talent_aquisition.dao;

import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import com.talent_aquisition.dao.InterviewRepository;
//import com.talent_aquisition.entities.Candidate;
import com.talent_aquisition.entities.Interview;

@Repository
public interface InterviewRepository extends CrudRepository<Interview,Integer> {

	



}
