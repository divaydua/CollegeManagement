package com.jpaTesting.collegeManagementSystem.collegeManagementSystem.repositories;

import com.jpaTesting.collegeManagementSystem.collegeManagementSystem.entities.AdmissionRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmissionRecordRepo extends JpaRepository<AdmissionRecordEntity,Long> {

}
