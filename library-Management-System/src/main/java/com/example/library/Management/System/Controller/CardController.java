package com.example.library.Management.System.Controller;

import com.example.library.Management.System.Entity.LibraryCard;
import com.example.library.Management.System.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    public CardService cardService;
    @PostMapping("/add")
    public ResponseEntity addCard(){

        LibraryCard card=cardService.addCard();
        String reponse="card is generated with id "+card.getCardNo();
        return new ResponseEntity(reponse, HttpStatus.OK);
    }

    @PutMapping("/associate")
    public ResponseEntity associatewithStudent(@RequestParam("studentid")Integer studentid ,@RequestParam("cardno")Integer cardNo){
        String response=cardService.associatewithStudent(studentid,cardNo);
        return new ResponseEntity(response,HttpStatus.OK);
    }
}
