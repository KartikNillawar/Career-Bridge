package com.kartikCode.CareerBridge.repository;


import com.kartikCode.CareerBridge.entity.JobPostActivity;
import com.kartikCode.CareerBridge.entity.JobSeekerApply;
import com.kartikCode.CareerBridge.entity.JobSeekerProfile;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);
}
