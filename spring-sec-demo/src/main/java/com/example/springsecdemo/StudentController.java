package com.example.springsecdemo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> list = new ArrayList<>(List.of(
            new Student(1, "Sujeewa" , "java"),
            new Student(2, "Mahela", "flutter"),
            new Student(3, "Logus", "HTML")
    ));


    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("students")
    public List<Student> getStudents(){
        return list;
    }
}
