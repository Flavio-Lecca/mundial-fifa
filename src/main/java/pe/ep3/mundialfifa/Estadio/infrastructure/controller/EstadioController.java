package pe.ep3.mundialfifa.Estadio.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.ep3.mundialfifa.Estadio.application.service.EstadioService;
import pe.ep3.mundialfifa.Estadio.infrastructure.response.EstadioResponse;

@RestController
@RequestMapping("/api/v1/mundial")
public class EstadioController {
    @Autowired
    private EstadioService estadioService;

    @GetMapping
    @RequestMapping("/estadios")
    public EstadioResponse getAll(){
        return estadioService.getAll();
    }
}
