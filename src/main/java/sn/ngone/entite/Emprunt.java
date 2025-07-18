package sn.ngone.entite;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "emprunts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateEmprunt;

    private LocalDate dateRetourPrevue;

    private LocalDate dateRetourEffective;

    private boolean prolonge;

    @ManyToOne
    private Utilisateur utilisateur;

    @ManyToOne
    private Livre livre;
}





