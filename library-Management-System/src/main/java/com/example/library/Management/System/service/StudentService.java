package com.example.library.Management.System.service;

import com.example.library.Management.System.Entity.Student;
import com.example.library.Management.System.Respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    @Autowired
    public StudentRepository studentRepository;
    public String addStudent(Student student){
        studentRepository.save(student);
        return "student has been added";
    }
}
