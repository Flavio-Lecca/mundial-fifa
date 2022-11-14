package pe.ep3.mundialfifa.Pais.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.ep3.mundialfifa.Pais.application.service.PaisService;
import pe.ep3.mundialfifa.Pais.infrastructure.response.PaisResponse;

@RestController
@RequestMapping("/api/v1/mundial")
public class PaisController {
    @Autowired
    private PaisService paisService;

    @GetMapping
    @RequestMapping("/paises")
    public PaisResponse getAll(){
        return paisService.getAll();
    }
}
