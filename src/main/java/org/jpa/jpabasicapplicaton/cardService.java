package org.jpa.jpabasicapplicaton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cardService {

    @Autowired
    cardRepository cardRepository;

    public String addCard(Card card) {
        cardRepository.save(card);
        return "Card Added Successfully";
    }
}
