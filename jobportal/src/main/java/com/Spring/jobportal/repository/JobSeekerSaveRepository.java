package com.Spring.jobportal.repository;

import com.Spring.jobportal.entity.JobPostActivity;
import com.Spring.jobportal.entity.JobSeekerProfile;
import com.Spring.jobportal.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

    void deleteAllByJob(JobPostActivity job);


}
