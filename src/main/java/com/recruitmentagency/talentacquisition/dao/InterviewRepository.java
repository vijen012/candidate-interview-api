package com.recruitmentagency.talentacquisition.dao;
import com.recruitmentagency.talentacquisition.entities.Interview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewRepository extends CrudRepository<Interview,Integer> {
}
