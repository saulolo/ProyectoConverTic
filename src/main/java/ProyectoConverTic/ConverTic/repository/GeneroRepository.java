package ProyectoConverTic.ConverTic.repository;

import ProyectoConverTic.ConverTic.modelo.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer> {
}
