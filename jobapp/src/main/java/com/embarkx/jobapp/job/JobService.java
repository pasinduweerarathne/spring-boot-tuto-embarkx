package com.embarkx.jobapp.job;

import java.util.List;

public interface JobService {

    List<Job> findAll();
    void createJob(Job job);
    Job getJobById(Long id);
    Boolean deleteJobById(Long id);
    boolean updateJobById(Long id, Job updatedJob);

}