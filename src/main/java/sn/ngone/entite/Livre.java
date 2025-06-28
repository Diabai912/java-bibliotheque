package sn.ngone.entite;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "livres")
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titre", nullable = false)
    private String titre;

    @Column(name = "auteur", nullable = false)
    private String auteur;

    @Column(name = "disponible")
    private boolean disponible;
}
