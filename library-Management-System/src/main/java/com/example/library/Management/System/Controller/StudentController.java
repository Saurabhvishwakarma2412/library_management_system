package com.example.library.Management.System.Controller;

import com.example.library.Management.System.Entity.Student;
import com.example.library.Management.System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")

public class StudentController {

    @Autowired
    public StudentService studentService;
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
       return studentService.addStudent(student);
    }
}
