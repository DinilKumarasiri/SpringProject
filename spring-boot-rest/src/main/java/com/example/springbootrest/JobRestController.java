package com.example.springbootrest;


import com.example.springbootrest.model.JobPost;
import com.example.springbootrest.service.JobService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("jobPost")
    //@ResponseBody
    public List<JobPost> getAllJobs(){
        return jobService.getAllJobs();
    }


    @GetMapping("jobPost/{postId}")
    //@ResponseBody
    public JobPost getJob(@PathVariable("postId") int postId){
        return jobService.getJob(postId);
    }

    @PostMapping("addJobPost")
    public JobPost addJobPost(@RequestBody JobPost jobPost){
        jobService.addJobs(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @PutMapping("updateJobPost")
    public JobPost updateJobPost(@RequestBody JobPost jobPost){
        jobService.updateJobPost(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }
    @GetMapping("deleteJobPost/{postId}")
    public String deleteJobPost(@PathVariable int postId){
        if (jobService.getJob(postId).getPostId() == postId)
            return "error : no Job Post for " + postId + " for this id";
        jobService.deleteJobPost(postId);
        return "message : successfully deleted";
    }

}
