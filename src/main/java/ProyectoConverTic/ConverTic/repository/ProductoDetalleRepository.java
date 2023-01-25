package ProyectoConverTic.ConverTic.repository;

import ProyectoConverTic.ConverTic.modelo.ProductoDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDetalleRepository extends JpaRepository<ProductoDetalle, Integer> {
}
