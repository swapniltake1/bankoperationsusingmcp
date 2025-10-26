package com.demo.bank.service;

import com.demo.bank.model.Card;
import com.demo.bank.repository.CardRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CardService {
    private final CardRepository repo;
    public CardService(CardRepository repo){ this.repo = repo; }
    public List<Card> getAllCards(){ return repo.findAll(); }
}
