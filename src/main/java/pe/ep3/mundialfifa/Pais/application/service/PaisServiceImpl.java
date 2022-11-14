package pe.ep3.mundialfifa.Pais.application.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.ep3.mundialfifa.Pais.domain.entity.Pais;
import pe.ep3.mundialfifa.Pais.infrastructure.repository.PaisRepository;
import pe.ep3.mundialfifa.Pais.infrastructure.response.BasicResponse;
import pe.ep3.mundialfifa.Pais.infrastructure.response.PaisResponse;


import java.util.List;

@Log4j2
@Service
public class PaisServiceImpl implements PaisService{
    @Autowired
    private PaisRepository paisRepository;

    @Override
    public PaisResponse getAll() {
        List<Pais> paisList = paisRepository.findAll();

        if (paisList.isEmpty()){
            return PaisResponse.builder()
                    .paisList(null)
                    .basicResponse(BasicResponse.whenNoDataFound("Pais")).build();
        }
        else {
            return PaisResponse.builder()
                    .paisList(paisList)
                    .basicResponse(BasicResponse.whenSuccess()).build();
        }
    }
}
