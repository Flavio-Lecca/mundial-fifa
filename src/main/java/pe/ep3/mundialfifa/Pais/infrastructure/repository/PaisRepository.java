package pe.ep3.mundialfifa.Pais.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.ep3.mundialfifa.Pais.domain.entity.Pais;

public interface PaisRepository extends JpaRepository<Pais,Long> {
}
