package pe.ep3.mundialfifa.Pais.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.ep3.mundialfifa.Pais.domain.entity.Pais;

import java.util.List;

public interface PaisRepository extends JpaRepository<Pais,Long> {
}
