package ProyectoConverTic.ConverTic.repository;

import ProyectoConverTic.ConverTic.modelo.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalificacionRepository extends JpaRepository<Calificacion, Integer> {
}
