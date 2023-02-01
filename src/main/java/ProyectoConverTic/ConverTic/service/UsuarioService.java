package ProyectoConverTic.ConverTic.service;


//26. Creo un package servicio, alli agrego las clases que respondan a la funcionalidad y lógica.

import ProyectoConverTic.ConverTic.modelo.Usuario;
import ProyectoConverTic.ConverTic.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //27. Llamo la anotación @Service para indicar a spring boot que esta es una clase servicio
public class UsuarioService {
    @Autowired //29. Esta anotación me permite decirle a spring boot que esta clase se va a conectar con el repositorio en cuestión (Usuario).
    UsuarioRepository usuarioRepository; /* 28. Hago la inyección de dependencias. Debo de enlazar este servicio al
    repositorio que hace referencia, en este caso el de UsuarioRepository, y para ello creó este objeto y lo nombro tal cual pero con minúscula.*/

    /*30. Debo de crear toda la lista de usurios que el admin puede ver y eso
    lo hago con el método getAll donde creo una lista con el nombre de la clase a la que se refiere, en este caso la de usuario.*/

    //MÉTODO PARA VER LOS USUARIOS
    /*Este método retornará la lista de usuarios usando métodos heredados del JPARepository, me trae un objeto de tipo
    * empresa cuando cuento con el id de la misma.*/
    public List<Usuario> getAllUsuarios(){
        List<Usuario> usuarioList = new ArrayList<>(); //31. /31. Creo un objeto de tipo UsuarioReposity para poder usar los métodos de dicha clase.
        usuarioRepository.findAll().forEach(usuario -> usuarioList.add(usuario));
        return usuarioList;
         /*32. Necesito llenar esa lista con algo, y ese algo es las empresas que estén registradas en la base de datos
        y que estén guardadas em empresaRepositiry, eso lo hago llamando la clase del repository con el método .findAll,
        este método me devuelve un objeto iterable, debo de recorrerlo con un forEach y por cada empresa que se
        encontrara dentro de él, la agregara a esa lista que acabo de crear; y después la retorno.
        Eso hace que cuando desde la página principal yo quiera ver todas las empresas lo que yo debo de hacer es llamar
        al método que se llama en este caso getAllEmpresas() y asi la puedo ver en pantalla.*/
    }


    //MÉTODO PARA EDITAR UN USUARIO
    public Usuario getUsuarioById(Integer id){  //33. Creamos un método que me traiga el Id del Usuario, porque con este puedo hacer lo que necesite.
        return usuarioRepository.findById(id).get();  //34. con findById(id).get() me traigo el id de Usuario.(si no le pongo el get, me trae es el espacio en memoria)
    }


    //MÉTODO PARA GUARDAR O ACTUALIZAR OBJETOS DE TIPO USUARIO (guardar y actualizar viene siendo el mismo método)
    public boolean saveOrUpdateUsuario(Usuario usuario){  //35. Método booleano porque me va a traer un false o un true (Trayendo el objeto Usuario)
        Usuario user = usuarioRepository.save(usuario);  //36. Creo un objeto temporal para verificar si la tarea se hizo o no.
        if(usuarioRepository.findById(user.getId())!=null){  //37. Utilizo el método save que es el que me va a guardar o actualizar la entidad.
            return true;   //38. Verifico con un condicional para saber si el objeto existe o no , y si sí, que lo actualice.
        }
        return false;
    }

    //MÉTODO PARA ELIMINAR USUARIOS (Elimina usuarios registradas teniendo el id)
    public boolean deleteUsuarios(Integer id){  //39. Método booleano porque me va a traer un false o un true (Trayendo el objeto Id).
        usuarioRepository.deleteById(id);  //40. Utilizo el método deleteById porque va a eliminar por ID, y es el que me va a eliminar entidad.
        if(getUsuarioById(id)!=null){  //41. Verifico con un condicional para saber si el objeto se eliminó o no llamando el método que ya habíamos creado.
            return false;
        }
        return true;
    }

    //42. Creamos el package controller.




}
