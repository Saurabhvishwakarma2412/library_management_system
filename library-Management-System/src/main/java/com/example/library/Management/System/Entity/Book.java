package com.example.library.Management.System.Entity;

import com.example.library.Management.System.Enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Book {

      @Id
      private int bookid;

      private String bookname;

      private int price;
      private int noofpages;
      private Genre genre;
      private double rating;

      @ManyToOne
      @JoinColumn
      private Author author;
}
