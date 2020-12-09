package com.example.TestUF2406.Model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BOOKS")
@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String title;

    @OneToMany(mappedBy = "book")
    private List<Quote> quotes;

}
