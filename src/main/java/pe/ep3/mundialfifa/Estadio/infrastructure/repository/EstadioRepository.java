package pe.ep3.mundialfifa.Estadio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.ep3.mundialfifa.Estadio.domain.entity.Estadio;

public interface EstadioRepository extends JpaRepository<Estadio,Long> {
}
