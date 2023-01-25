package ProyectoConverTic.ConverTic.repository;

import ProyectoConverTic.ConverTic.modelo.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer> {
}
