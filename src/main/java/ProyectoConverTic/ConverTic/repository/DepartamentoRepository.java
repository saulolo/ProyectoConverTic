package ProyectoConverTic.ConverTic.repository;

import ProyectoConverTic.ConverTic.modelo.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
}
