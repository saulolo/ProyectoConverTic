package ProyectoConverTic.ConverTic.repository;

import ProyectoConverTic.ConverTic.modelo.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Integer> {
}
