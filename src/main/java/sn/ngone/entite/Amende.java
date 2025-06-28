package sn.ngone.entite;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "amendes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Amende {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double montant;

    private String motif;

    private String statut; // "payée" ou "impayée"

    private LocalDate dateCreation;

    @ManyToOne
    private Utilisateur utilisateur;
}


