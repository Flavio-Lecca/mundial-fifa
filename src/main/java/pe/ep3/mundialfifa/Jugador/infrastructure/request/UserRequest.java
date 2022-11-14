package pe.ep3.mundialfifa.Jugador.infrastructure.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserRequest {
    private Long id;
    private String jugador;
    private String pais;
    private String edad;
}
