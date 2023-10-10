package com.example.library.Management.System.Entity;

import com.example.library.Management.System.Enums.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="library")
public class LibraryCard {


    @Id
    private Integer cardNo;

    @Enumerated(value= EnumType.STRING)
    private CardStatus cardStatus;
}
