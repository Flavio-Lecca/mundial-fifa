package pe.ep3.mundialfifa.Estadio.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "Estadio")
@Table(
        name = "Estadio"
)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Estadio {
    @SequenceGenerator(
            name = "Estadio_sequence",
            sequenceName = "Estadio_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Estadio_sequence"
    )
    @Id
    Long id;
    String estadio;
    String ciudad;
}
