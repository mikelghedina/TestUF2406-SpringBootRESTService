package com.example.TestUF2406.Service;


import com.example.TestUF2406.Model.Quote;
import com.example.TestUF2406.Repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuoteService {


    @Autowired
    QuoteRepository quoteRepository;

    public Iterable<Quote> findAllQuotes(){
        return quoteRepository.findAll();
    }

    public Optional<Quote> findOneQuoteById(Long id){
        return quoteRepository.findById(id);
    }

    public Quote addQuote(Quote quote){
        return quoteRepository.save(quote);
    }

    public Quote deleteQuoteById(Long id){
        quoteRepository.deleteById(id);
        return null;
    }
}
