package com.jpaTesting.collegeManagementSystem.collegeManagementSystem.repositories;

import com.jpaTesting.collegeManagementSystem.collegeManagementSystem.entities.ProfessorEntity;
import com.jpaTesting.collegeManagementSystem.collegeManagementSystem.entities.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProffesorRepo extends JpaRepository<ProfessorEntity, Long> {

  //  Optional<ProfessorEntity> findBySubject(SubjectEntity subjectEntity);
}
