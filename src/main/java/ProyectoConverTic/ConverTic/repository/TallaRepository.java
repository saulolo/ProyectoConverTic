package ProyectoConverTic.ConverTic.repository;

import ProyectoConverTic.ConverTic.modelo.Talla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TallaRepository extends JpaRepository<Talla, Integer> {
}
