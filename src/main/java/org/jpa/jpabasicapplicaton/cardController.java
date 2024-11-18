package org.jpa.jpabasicapplicaton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("card")
public class cardController {

    @Autowired
    cardService cardService;

    @PostMapping("/add")
    public String addCard(@RequestParam Card card){
        return cardService.addCard(card);
    }
}
