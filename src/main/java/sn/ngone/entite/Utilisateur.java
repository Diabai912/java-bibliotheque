package sn.ngone.entite;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Table(name = "utilisateurs")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utilisateur")
    private Long id;

    @Column(name = "prenom", length = 100, nullable = false)
    private String prenom;

    @Column(name = "nom", length = 100, nullable = false)
    private String nom;

    @Column(name = "age")
    private byte age;

    @Column(name = "solde")
    private double solde;

    @ManyToOne
    @JoinColumn(name = "createur_login", referencedColumnName = "login", nullable = true)
    private Administrateur createur;

    public void setage(byte b) {
    }
}