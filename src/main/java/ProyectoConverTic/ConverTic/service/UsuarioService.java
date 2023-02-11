package ProyectoConverTic.ConverTic.service;


//[26] Package service

import ProyectoConverTic.ConverTic.modelo.Usuario;
import ProyectoConverTic.ConverTic.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //[27]
public class UsuarioService {
    @Autowired //[29]
    UsuarioRepository usuarioRepository; //[28]


    //MÉTODO PARA VER LOS USUARIOS
    public List<Usuario> getAllUsuarios() {  //[30]
        List<Usuario> usuarioList = new ArrayList<>(); //[31]
        usuarioRepository.findAll().forEach(usuario -> usuarioList.add(usuario));  //[32]
        return usuarioList;
    }


    //MÉTODO PARA EDITAR UN USUARIO
    public Usuario getUsuarioById(Integer id) {  //[33]
        return usuarioRepository.findById(id).get();  //[34]
    }


    //MÉTODO PARA GUARDAR O ACTUALIZAR OBJETOS DE TIPO USUARIO
    public boolean saveOrUpdateUsuario(Usuario usuario) {  //[35]
        Usuario user = usuarioRepository.save(usuario);  //[36]
        if (usuarioRepository.findById(user.getId()) != null) {  //[37]
            return true;   //[38]
        }
        return false;
    }

    //MÉTODO PARA ELIMINAR USUARIOS
    public boolean deleteUsuario(Integer id) {  //[39]
        usuarioRepository.deleteById(id);  //[40]
        if (usuarioRepository.findById(id) != null) {  //[41]
            return true;
        }
        return false;
    }

    //[42] Creamos el package controller.


}
