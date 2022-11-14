package pe.ep3.mundialfifa.Estadio.infrastructure.response;

import lombok.Builder;
import lombok.Data;
import pe.ep3.mundialfifa.Estadio.domain.entity.Estadio;

import java.util.List;

@Builder
@Data
public class EstadioResponse {
    private List<Estadio> estadioList;
    private BasicResponse basicResponse;
}
