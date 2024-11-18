package org.jpa.jpabasicapplicaton;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name= "card_info")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;
    private Date expiry;

    @Enumerated(EnumType.STRING)
    Status status;

    @OneToOne
    @JoinColumn
    User user;
}
