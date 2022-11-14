package pe.ep3.mundialfifa.Jugador.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.ep3.mundialfifa.Jugador.application.service.JugadorService;
import pe.ep3.mundialfifa.Jugador.infrastructure.response.JugadorResponse;

@RestController
@RequestMapping("/api/v1/mundial")
public class JugadorController {
    @Autowired
    private JugadorService jugadorService;

    @GetMapping
    @RequestMapping("/jugadores")
    public JugadorResponse getAll(){
        return jugadorService.getAll();
    }
}
