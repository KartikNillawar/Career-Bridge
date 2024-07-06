package com.kartikCode.CareerBridge.repository;


import com.kartikCode.CareerBridge.entity.JobPostActivity;
import com.kartikCode.CareerBridge.entity.JobSeekerProfile;
import com.kartikCode.CareerBridge.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}
