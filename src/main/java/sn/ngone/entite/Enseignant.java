package sn.ngone.entite;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "enseignants")
public class Enseignant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String prenom;

    @Column(length = 100, nullable = false)
    private String nom;

    @Column(length = 150, nullable = false, unique = true)
    private String email;

    @Column(length = 20)
    private String telephone;
}