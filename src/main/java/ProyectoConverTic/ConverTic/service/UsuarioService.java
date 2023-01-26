package ProyectoConverTic.ConverTic.service;


//26. Creo un package servicio, alli agrego las clases que respondan a la funcionalidad y lógica.

import ProyectoConverTic.ConverTic.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //27. Llamo la anotación @Service para indicar a spring boot que esta es una clase servicio
public class UsuarioService {
    @Autowired //29. Esta anotación me permite deciirle a spring boot que esta clase se va a conectar con el repositorio en cuestión.
    UsuarioRepository usuarioRepository; /* 28. Debo de enlazar este servicio al repositorio que hace referencia, en este
     caso el de UsuarioRepository, y para ello creó este objeto y lo nombro tal cual pero con minúscula.*/

}
