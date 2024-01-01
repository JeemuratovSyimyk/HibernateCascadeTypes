package org.example.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "countries")
@Setter
@Getter
@NoArgsConstructor
public class Country { //Source Class
   @Id
   @GeneratedValue(
           generator = "country gen",
           strategy = GenerationType.SEQUENCE )
   @SequenceGenerator(name = "country gen",
           sequenceName = "country seq",
           allocationSize = 1)
    private Long id;
    private String name;
    private String language;
   @OneToOne(cascade = {
           CascadeType.PERSIST,
           CascadeType.DETACH,
           CascadeType.MERGE,
           CascadeType.REFRESH,
           CascadeType.REMOVE
           })
    private President president;

    public Country(String name, String language) {
        this.name = name;
        this.language = language;

    }

    public Country(String name, String language, President president) {
        this.name = name;
        this.language = language;
        this.president = president;
    }
}
