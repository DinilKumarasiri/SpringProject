package com.example.jobapp;

import com.example.jobapp.model.JobPost;
import com.example.jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping({"/" , "home"} )
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        jobService.addJobs(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewAlljobs(Model m){
        List<JobPost> jobList = jobService.getAllJobs();
        m.addAttribute("jobPosts", jobList);
        return "viewalljobs";
    }
}
