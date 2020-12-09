package com.example.TestUF2406.Model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "QUOTES")
@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Quote {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String tag;
    private String sentence;
    private int numberWords;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable=true)
    private Book book;

}
