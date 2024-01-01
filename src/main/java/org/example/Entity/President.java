package org.example.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "presidents")
@Setter
@Getter
@NoArgsConstructor
public class President { // Target Class
    @Id
    @GeneratedValue(
            generator = "president gen",
            strategy = GenerationType.SEQUENCE )
    @SequenceGenerator(name = "president gen",
            sequenceName = "president seq",
            allocationSize = 1)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
   @Column(name = "last_name")
    private String lastName;
    private String email;
  @OneToOne(mappedBy = "president",
    cascade = {
        CascadeType.PERSIST,
                CascadeType.DETACH,
                CascadeType.MERGE,
                CascadeType.REFRESH,
          //      CascadeType.REMOVE
    })
    private Country country;

    public President(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    }

