package com.job.jobms.job;

import com.job.jobms.dto.JobWithCompanyDTO;

import java.util.List;

public interface JobService {
    List<JobWithCompanyDTO> findAll();
    void createJob(Job job);
    Job getJobById(Long id);
    Boolean deleteJobById(Long id);
    boolean updateJobById(Long id, Job updatedJob);
}
