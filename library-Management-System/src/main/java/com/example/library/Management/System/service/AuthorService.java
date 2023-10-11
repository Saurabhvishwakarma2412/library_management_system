package com.example.library.Management.System.service;

import com.example.library.Management.System.Entity.Author;
import com.example.library.Management.System.Respository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    public AuthorRepository authorRepository;

    public String addAuthor(Author author){
        authorRepository.save(author);
        return "Author is added to database";
    }
    public List<String> getAllAuthor(){
        List<Author> list=authorRepository.findAll();
        List<String> ans=new ArrayList<>();
        for(Author author:list){
            ans.add(author.getAuthorname());
        }
        return ans;
    }
    public Author getAuthor(Integer id) throws Exception{
        Optional<Author> optionalAuthor=authorRepository.findById(id);

        if(!optionalAuthor.isPresent()){
            throw new Exception("invalid input");
        }
        Author author=optionalAuthor.get();
        return author;
    }
}
