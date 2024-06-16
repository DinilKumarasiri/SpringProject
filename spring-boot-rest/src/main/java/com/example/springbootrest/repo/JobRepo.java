package com.example.springbootrest.repo;

import com.example.springbootrest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {}

//
//    List<JobPost> jobs = new ArrayList<>(
//            Arrays.asList(new JobPost(1,"we","weqwre",123,new ArrayList<>())
//                    )
//    );
//
//    public List<JobPost> getAllJobs(){
//        return jobs;
//    }
//
//    public void addJob(JobPost job){
//        jobs.add(job);
//    }
//
//    public JobPost getJob(int postId){
//        for (JobPost job : jobs){
//            if (job.getPostId() == postId)
//                return job;
//        }
//        return null;
//    }
//
//    public void updateJobPost(JobPost jobPost){
//        for (JobPost jobPost1 : jobs){
//            if (jobPost1.getPostId() == jobPost.getPostId()){
//                jobPost1.setPostProfile(jobPost.getPostProfile());
//                jobPost1.setPostDescription(jobPost.getPostDescription());
//                jobPost1.setPostTechStack(jobPost.getPostTechStack());
//                jobPost1.setReqExperience(jobPost.getReqExperience());
//            }
//        }
//    }
//
//    public void deleteJobPost(int postId){
//        jobs.removeIf(job -> job.getPostId() == postId);
//    }
