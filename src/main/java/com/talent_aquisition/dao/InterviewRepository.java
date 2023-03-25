package com.talent_aquisition.dao;
import com.talent_aquisition.entities.Interview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewRepository extends CrudRepository<Interview,Integer> {
}
