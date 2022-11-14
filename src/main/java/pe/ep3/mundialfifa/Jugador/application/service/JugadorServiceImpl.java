package pe.ep3.mundialfifa.Jugador.application.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.ep3.mundialfifa.Jugador.domain.entity.Jugador;
import pe.ep3.mundialfifa.Jugador.infrastructure.repository.JugadorRepository;
import pe.ep3.mundialfifa.Jugador.infrastructure.response.BasicResponse;
import pe.ep3.mundialfifa.Jugador.infrastructure.response.JugadorResponse;

import java.util.List;

@Log4j2
@Service
public class JugadorServiceImpl implements JugadorService{
    @Autowired
    private JugadorRepository jugadorRepository;

    @Override
    public JugadorResponse getAll() {
        List<Jugador> jugadorList = jugadorRepository.findAll();

        if (jugadorList.isEmpty()){
            return JugadorResponse.builder()
                    .jugadorList(null)
                    .basicResponse(BasicResponse.whenNoDataFound("Jugador")).build();
        }
        else {
            return JugadorResponse.builder()
                    .jugadorList(jugadorList)
                    .basicResponse(BasicResponse.whenSuccess()).build();
        }
    }
}
