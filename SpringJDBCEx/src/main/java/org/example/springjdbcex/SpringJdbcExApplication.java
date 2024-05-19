package org.example.springjdbcex;

import org.example.springjdbcex.model.Student;
import org.example.springjdbcex.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

        Student student = context.getBean(Student.class);
        student.setRollno(104);
        student.setName("Dinil");
        student.setMarks(80);

        StudentService studentService = context.getBean(StudentService.class);
        studentService.addStudent(student);

        List<Student> students = studentService.getStudents();
        System.out.println(students);
    }

}
