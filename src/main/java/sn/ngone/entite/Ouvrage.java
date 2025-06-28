package sn.ngone.entite;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ouvrages")
public class Ouvrage {

    @Id
    @Column(length = 20)
    private String isbn;

    @Column(length = 200, nullable = false)
    private String titre;

    @Column(length = 100)
    private String auteur;

    @Column(length = 100)
    private String editeur;

    private int annee;

    @Column(length = 50)
    private String categorie;

    private int nbExemplaires;
}