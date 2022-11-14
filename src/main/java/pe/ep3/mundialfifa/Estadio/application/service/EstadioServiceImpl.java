package pe.ep3.mundialfifa.Estadio.application.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.ep3.mundialfifa.Estadio.domain.entity.Estadio;
import pe.ep3.mundialfifa.Estadio.infrastructure.repository.EstadioRepository;
import pe.ep3.mundialfifa.Estadio.infrastructure.response.BasicResponse;
import pe.ep3.mundialfifa.Estadio.infrastructure.response.EstadioResponse;

import java.util.List;

@Log4j2
@Service
public class EstadioServiceImpl implements EstadioService{
    @Autowired
    private EstadioRepository estadioRepository;

    @Override
    public EstadioResponse getAll() {
        List<Estadio> estadioList = estadioRepository.findAll();

        if (estadioList.isEmpty()){
            return EstadioResponse.builder()
                    .estadioList(null)
                    .basicResponse(BasicResponse.whenNoDataFound("Estadio")).build();
        }
        else {
            return EstadioResponse.builder()
                    .estadioList(estadioList)
                    .basicResponse(BasicResponse.whenSuccess()).build();
        }
    }
}
