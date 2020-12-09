package com.example.TestUF2406.Repository;

import com.example.TestUF2406.Model.Quote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Long> {


}
