package com.example.library.Management.System.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="Student")

public class Student {
     @Id
    private int studentid;

     private String name;

     private int age;

     @Column(name="contacts",unique = true,nullable = false)
     private String mobile_no;

     private String email_id;

     @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private LibraryCard libraryCard;
}
