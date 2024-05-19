package org.example.springjdbcex.service;

import org.example.springjdbcex.model.Student;
import org.example.springjdbcex.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    public StudentRepo getRepo(){
        return this.repo;
    }

    @Autowired
    public void setRepo(StudentRepo studentRepo){
        this.repo = studentRepo;
    }


    public void addStudent(Student student){
        repo.save(student);
    }

    public List<Student> getStudents(){
        return repo.findAll();
    }
}
