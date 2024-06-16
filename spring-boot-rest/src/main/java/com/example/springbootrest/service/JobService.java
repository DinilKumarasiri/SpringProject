package com.example.springbootrest.service;

import com.example.springbootrest.JobRestController;
import com.example.springbootrest.model.JobPost;
import com.example.springbootrest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;


    public JobPost getJob(int postId){
        return jobRepo.findById(postId).orElse(new JobPost());
    }

    public void addJobs(JobPost jobPost){
        jobRepo.save(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobRepo.findAll();
    }

    public void updateJobPost(JobPost jobPost){
        jobRepo.save(jobPost);
    }

    public void deleteJobPost(int postId){
        jobRepo.delete(jobRepo.findById(postId).orElse(new JobPost()));
    }
}
