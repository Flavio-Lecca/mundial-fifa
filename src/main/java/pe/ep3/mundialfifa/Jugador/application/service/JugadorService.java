package pe.ep3.mundialfifa.Jugador.application.service;

import pe.ep3.mundialfifa.Jugador.infrastructure.request.UserRequest;
import pe.ep3.mundialfifa.Jugador.infrastructure.response.BasicResponse;
import pe.ep3.mundialfifa.Jugador.infrastructure.response.JugadorResponse;

public interface JugadorService {
    public JugadorResponse getAll();
    public BasicResponse addUser(UserRequest request);
}
