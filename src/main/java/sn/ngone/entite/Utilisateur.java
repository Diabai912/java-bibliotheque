package sn.ngone.entite;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String email;
    private String telephone;

    @Enumerated(EnumType.STRING)
    private Statut statut; // ÉTUDIANT ou ENSEIGNANT
}