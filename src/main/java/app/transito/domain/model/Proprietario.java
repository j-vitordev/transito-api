package app.transito.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)//USA APENAS O QUE EU EXPLICITAR
@Entity
@Getter
@Setter
public class Proprietario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)//BD AUTOINCREMENTA O ID
    @EqualsAndHashCode.Include
    @Id
    private Long id;
    private String nome;
    private String email;
    private String telefone;


}
