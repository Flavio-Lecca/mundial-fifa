package pe.ep3.mundialfifa.Jugador.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.ep3.mundialfifa.Jugador.application.service.JugadorService;
import pe.ep3.mundialfifa.Jugador.infrastructure.request.UserRequest;
import pe.ep3.mundialfifa.Jugador.infrastructure.response.BasicResponse;
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

    @PostMapping
    @RequestMapping("/add")
    public ResponseEntity<BasicResponse> addUser(@RequestBody UserRequest request){
        BasicResponse response = jugadorService.addUser(request);
        return ResponseEntity.status(response.getCode()).body(response);
    }
}
