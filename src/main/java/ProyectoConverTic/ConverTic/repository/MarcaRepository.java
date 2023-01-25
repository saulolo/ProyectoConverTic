package ProyectoConverTic.ConverTic.repository;

import ProyectoConverTic.ConverTic.modelo.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer> {
}
