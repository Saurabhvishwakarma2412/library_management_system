package com.example.library.Management.System.Controller;



import com.example.library.Management.System.Entity.Author;
import com.example.library.Management.System.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Author")
public class AuthorController {

    @Autowired
   public AuthorService authorService;

    @PostMapping("/add")
    public String addAuthor(@RequestBody Author author){
       return authorService.addAuthor(author);

    }
    @GetMapping("/findall")
    public List<String> getAllAuthor(){
        List<String> ans=authorService.getAllAuthor();
        return ans;
    }

    @GetMapping("/getAuthor/{id}")
    public ResponseEntity getAuthor(@PathVariable("id")Integer id){

        try{
             Author author=authorService.getAuthor(id);
            return new ResponseEntity(author, HttpStatus.OK);
          }catch (Exception e){
             return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
          }
    }

}
