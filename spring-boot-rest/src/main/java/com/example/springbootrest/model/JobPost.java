package com.example.springbootrest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {

    @Id
    private int postId;
    private String  postProfile;
    private String postDescription;
    private int reqExperience;
    private List<String> postTechStack;


}
