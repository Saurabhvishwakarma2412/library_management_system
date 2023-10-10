package com.example.library.Management.System.Respository;

import com.example.library.Management.System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
