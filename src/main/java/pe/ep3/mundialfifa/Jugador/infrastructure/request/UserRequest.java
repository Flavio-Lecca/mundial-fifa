package pe.ep3.mundialfifa.Jugador.infrastructure.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserRequest {
    private Long id;
    private String jugador;
    private String pais;
    private String edad;
}
