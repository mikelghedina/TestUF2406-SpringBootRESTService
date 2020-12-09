package com.example.TestUF2406.Controller;


import com.example.TestUF2406.Model.Quote;
import com.example.TestUF2406.Service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class QuoteController {

    @Autowired
    QuoteService quoteService;

    @GetMapping("/quotes")
    public Iterable<Quote> findAllQuotes(){
        return quoteService.findAllQuotes();
    }

    @GetMapping("/quotes{id}")
    public Optional<Quote> findOneQuoteById(@PathVariable Long id){
        return quoteService.findOneQuoteById(id);
    }

    @PostMapping("/quotes")
    public Quote addQuote(@RequestBody Quote quote){
        return quoteService.addQuote(quote);
    }

    @RequestMapping("/quotes{id}")
    public void deleteQuoteById(@PathVariable Long id){
        quoteService.deleteQuoteById(id);

    }

}
