package ProyectoConverTic.ConverTic.repository;

import ProyectoConverTic.ConverTic.modelo.ProductoVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoVentaRepository extends JpaRepository<ProductoVenta, Integer> {
}
