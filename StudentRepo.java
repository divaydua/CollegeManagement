package com.jpaTesting.collegeManagementSystem.collegeManagementSystem.repositories;

import com.jpaTesting.collegeManagementSystem.collegeManagementSystem.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Long> {
}
