package pe.ep3.mundialfifa.Pais.infrastructure.response;

import lombok.Builder;
import lombok.Data;
import pe.ep3.mundialfifa.Pais.domain.entity.Pais;

import java.util.List;

@Builder
@Data
public class PaisResponse {
    private List<Pais> paisList;
    private BasicResponse basicResponse;
}
