package com.example.library.Management.System.service;

import com.example.library.Management.System.Entity.LibraryCard;
import com.example.library.Management.System.Entity.Student;
import com.example.library.Management.System.Enums.CardStatus;
import com.example.library.Management.System.Respository.CardRepository;
import com.example.library.Management.System.Respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CardService {

    @Autowired
    public CardRepository cardRepository;

    @Autowired
    public StudentRepository studentRepository;
    public LibraryCard addCard(){
        LibraryCard card=new LibraryCard();
        card.setCardStatus(CardStatus.NEW);
        card= cardRepository.save(card);
        return card;
    }

    public  String associatewithStudent(Integer studentId,Integer cardno){

     Optional<Student> studentOptional  =studentRepository.findById(studentId);
     Student student=studentOptional.get();
     Optional<LibraryCard> libraryCardOptional=cardRepository.findById(cardno);
     LibraryCard card=libraryCardOptional.get();

     card.setCardStatus(CardStatus.ACTIVE);
     student.setLibraryCard(card);
     card.setStudent(student);
     studentRepository.save(student);
     return "student"+studentId+" and card"+cardno+" mapped";
    }
}
