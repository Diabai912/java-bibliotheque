package sn.ngone;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor
@Table(name = "administrateurs")
public class Administrateur {
    @Id
    @Column(name = "login",length = 50)
    private String login;
    @Column(name = "password",length = 50)
    private String password;
}
