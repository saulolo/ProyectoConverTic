package ProyectoConverTic.ConverTic.repository;

import ProyectoConverTic.ConverTic.modelo.EstadoPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoPagoRepository extends JpaRepository<EstadoPago, Integer> {
}
