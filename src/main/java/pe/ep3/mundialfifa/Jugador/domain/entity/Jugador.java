package pe.ep3.mundialfifa.Jugador.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "Jugador")
@Table(
        name = "Jugador"
)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Jugador {
    @SequenceGenerator(
            name = "jugador_sequence",
            sequenceName = "jugador_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "jugador_sequence"
    )
    @Id
    Long id;
    String jugador;
    String pais;
    String edad;
}
