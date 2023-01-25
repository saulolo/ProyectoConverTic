package ProyectoConverTic.ConverTic.repository;


/*22. Creo un package donde van a ir mis repositorios (un repository es un objeto que me permite acceder a los datos donde
se guarda la información contenida en las BD en un tipo objeto). y luego créo una interfaz con el nombre de la clase
añadida la palabra repository para una mejor lectura. Esto con la idea de que hibernate creo un objeto de tipo BD aquí en
el proyecto esto con el fin de que a cada instante no se tenga que conectar a la BD para acceder a la información.
Un repositorio es de clase interfase. Para eso se crean repositorios, para que actuen de puente entre la tabla y la
entidad, es como un traductor.*/

import ProyectoConverTic.ConverTic.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //24. Agrego @Repository para indicar a spring boot que esta clase es un repositorio.
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> { /* 23. extendemos de JpaRepository para la conexión con hibernate.
y para relacionarlo con la entidad usuario con la que se extiende, tenemos que crear un objeto de dicha entidad seguido
del tipo de variable que tiene su id, en este caso, el de integer. Esto lo que haces, es que cuando lance la app
me va a crear una especie de BD virtual que es copia que esta en nuestro servidor de postgresql y la va a traducir para
que nuestra entidad la entienda y pueda trabajar con ella. */

}

/*25. Este mismo porceso lo replico en todas mis entidades del package modelo, o sea, cada entidad tiene su respectivo
repositorio.*/
