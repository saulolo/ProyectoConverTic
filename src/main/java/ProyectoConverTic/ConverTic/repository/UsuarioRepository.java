package ProyectoConverTic.ConverTic.repository;


//[22] Interfaz Repository

import ProyectoConverTic.ConverTic.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //[24]
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> { //[23]

}


//[25] Creo los demás repositorios de todas las entidades
