package pe.ep3.mundialfifa.Jugador.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.ep3.mundialfifa.Jugador.domain.entity.Jugador;

public interface JugadorRepository extends JpaRepository<Jugador,Long> {
}
