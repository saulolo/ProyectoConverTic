package ProyectoConverTic.ConverTic.repository;

import ProyectoConverTic.ConverTic.modelo.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento, Integer> {
}
