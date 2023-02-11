package ProyectoConverTic.ConverTic.controller;

import ProyectoConverTic.ConverTic.modelo.Usuario;
import ProyectoConverTic.ConverTic.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

//[43]

//[1]
@Controller  //[44]
//[45]

public class ControllerFull {
    @Autowired  //[47]
    UsuarioService usuarioService; //[46]

    //SERVICIO VER USUARIO [48]
    @GetMapping({"/", "VerUsuarios"}) //[49]
    public String viewUsuario(Model model, @ModelAttribute("mensaje") String mensaje) { //[50], [51], [52], [53], [98] y [102]
        List<Usuario> listaUsuario = usuarioService.getAllUsuarios();
        model.addAttribute("usualist", listaUsuario);
        model.addAttribute("mensaje", mensaje); //[99]
        return "VerUsuarios";   //[54]
    }


    //[55] Creamos el package templates

    //[56] Creamos el Template verUsuarios


    //SERVICIO AGREGAR USUARIO
    @GetMapping("/AgregarUsuario") //[100]
    public String nuevoUsuario(Model model, @ModelAttribute("mensaje") String mensaje) {  //[63]
        Usuario user = new Usuario();  //[64]
        model.addAttribute("user", user);  //[65]
        model.addAttribute("mensaje", mensaje);
        return "agregarUsuario";  //[66]
    }
    //[67] Procedo a crear el template agregarUsuario

    //SERVICIO GUARDAR USUARIO [78]
    @PostMapping("/GuardarUsuario") //[79]
    public String guardarUsuarios(Usuario user, RedirectAttributes redirectAttributes) { //[80]
        if (usuarioService.saveOrUpdateUsuario(user) == true) { //[81]
            redirectAttributes.addFlashAttribute("mensaje", "saveOK");  //[94] y [95]
            return "redirect:/VerUsuarios";  //[95.1] y [82]
        }
        redirectAttributes.addFlashAttribute("mensaje", "saveError"); //[96]
        return "redirect:/agregarUsuario";  //[83]
    }

    //SERVICIO EDITAR USUARIO
    @GetMapping("/EditarUsuario/{id}") //[84] y [101]
    public String editarUsuario(Model model, @PathVariable Integer id, @ModelAttribute("mensaje") String mensaje) { //[85]
        Usuario user = usuarioService.getUsuarioById(id);   //[86]
        model.addAttribute("user", user);  //[87]
        model.addAttribute("mensaje", mensaje);
        return "editarUsuario";     //[88]
    }
    //[89]. Creo el html editarUsuario


    //SERVICIO ACTUALIZAR USUARIO [92]
    @PostMapping("/ActualizarUsuario") //[92.1]
    public String updateUsuario(@ModelAttribute("user") Usuario user, RedirectAttributes redirectAttributes) {
        if (usuarioService.saveOrUpdateUsuario(user)) { //[92.2]
            redirectAttributes.addFlashAttribute("mensaje", "updateOK"); //[97]
            return "redirect:/VerUsuarios";
        }
        redirectAttributes.addFlashAttribute("mensaje", "updateError");
        return "redirect:/EditarUsuario";
    }

    //SERVICIO ELIMINAR USUARIO [93]
    @GetMapping("/EliminarUsuario/{id}")
    public String eliminarUsuario(@PathVariable Integer id, RedirectAttributes redirectAttributes) { //[93.1]
        if (usuarioService.deleteUsuario(id) == true) {  //[93.2]
            redirectAttributes.addFlashAttribute("mensaje", "deleteOK");  //[97.1]
            return "redirect:/VerUsuarios";
        }
        redirectAttributes.addFlashAttribute("mensaje", "deleteError");
        return "redirect:/VerUsuarios";
    }

}




