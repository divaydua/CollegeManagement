package com.jpaTesting.collegeManagementSystem.collegeManagementSystem.repositories;

import com.jpaTesting.collegeManagementSystem.collegeManagementSystem.entities.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo extends JpaRepository<SubjectEntity,Long> {
}
