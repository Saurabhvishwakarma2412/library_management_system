package com.example.library.Management.System.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Author {

    @Id
    private int authorid;
    private String authorname;

    private int age;

    @OneToMany( mappedBy="author",cascade = CascadeType.ALL)
    List<Book> bookList=new ArrayList<>();
}
