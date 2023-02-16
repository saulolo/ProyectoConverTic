package ProyectoConverTic.ConverTic.repository;

import ProyectoConverTic.ConverTic.modelo.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


//[128] Me dirijo a Repository y creo ProductoRepository
@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer> {

}

//[129] Me dirijo a Service y creo ProductoService en caso de no haberlo creado


