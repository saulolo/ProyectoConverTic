package ProyectoConverTic.ConverTic.repository;

import ProyectoConverTic.ConverTic.modelo.ProductoDetalle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ProductoDetalleRepository extends CrudRepository<ProductoDetalle, Integer> { //[117]
    //@Query(value = "SELECT * FROM empleado WHERE empresa_id=?1", nativeQuery = true)")
    /* public abstract ArrayList<ProductoDetalle> findByEmpresa(Integer id); */
    //[127] Si quisiera crear un método al repository porque no se encuentra en el JPA, asi lo debo de hacer.
    //NOTA: para tal caso ver la video clase de MinTic Clase 14 fecha 31 de Agosto de 2022, Hora:1:20
    //Luego debo debo de ir a en caso tal de implementarlo Service y replicar esto porque todos esta conectado


}

//[118]
