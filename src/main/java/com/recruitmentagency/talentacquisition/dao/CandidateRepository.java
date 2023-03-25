package com.recruitmentagency.talentacquisition.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.recruitmentagency.talentacquisition.entities.Candidate;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate,Integer> {
}
