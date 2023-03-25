package com.talent_aquisition.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.talent_aquisition.entities.Candidate;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate,Integer> {
}
