package pe.ep3.mundialfifa.Pais.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "Pais")
@Table(
        name = "Pais"
)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pais {

    @SequenceGenerator(
            name = "pais_sequence",
            sequenceName = "pais_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "pais_sequence"
    )
    @Id
    Long id;
    String pais;
    String continente;
    String grupo;
}
