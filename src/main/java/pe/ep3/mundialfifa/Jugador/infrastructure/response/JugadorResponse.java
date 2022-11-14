package pe.ep3.mundialfifa.Jugador.infrastructure.response;

import lombok.Builder;
import lombok.Data;
import pe.ep3.mundialfifa.Jugador.domain.entity.Jugador;

import java.util.List;

@Builder
@Data
public class JugadorResponse {
    private List<Jugador> jugadorList;
    private BasicResponse basicResponse;
}
