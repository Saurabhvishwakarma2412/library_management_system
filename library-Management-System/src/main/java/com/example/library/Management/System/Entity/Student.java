package com.example.library.Management.System.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="Student")

public class Student {
     @Id
    private int studentd;

     private String name;

     private int age;

     @Column(name="contacts",unique = true,nullable = false)
     private String mobile_no;

     private String email_id;
}
