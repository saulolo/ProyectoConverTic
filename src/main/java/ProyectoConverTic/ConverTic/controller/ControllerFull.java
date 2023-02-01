package ProyectoConverTic.ConverTic.controller;

import ProyectoConverTic.ConverTic.modelo.Usuario;
import ProyectoConverTic.ConverTic.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//43. Creamos la clase Controller, aqui iran todas lac conexiones del aplicativo.

@Controller  //45. Vamos a utilizar @Controller
/*1. Hace un llamado al servidor y me va a traer una respuesta que me va a dejar ver en pantalla.
la diferencia con el @Controller es que éste trabaja protocolo de comunicación http, o sea trae por respuestas información
em formato xml, html y utiliza comandos diferentes a get y post y cuando trabajamos @RestController se comunica con
respuestas diferentes, puede traer un json, bloques de información, es como una version más nueva de un controlador normal*/
/*44. Aplicativo de spring boot que se comunica con el servidor le dice que este va hacer el main.
(me lo traigo de la clase ConverTicAplication para indicar que desde aqui se hará la comunicación.*/

public class ControllerFull {
    @Autowired  //47. Traigo esta anotación para poder decirle a Spring que vamos a utilizar los métodos de la clase que instanciamos.
    UsuarioService usuarioService; //46. Instancio el objeto UsuarioService para poderme traer todos sus métodos.

    @GetMapping({"/Usuarios","VerUsuarios"}) //49. Creo dos landing para visualizarlo en el html.
    public String viewEmpresas(Model model){  //50. Creamos un método viewEmpresas(nombre opcional) que regrese cadenas.
        List<Usuario> listaUsuario = usuarioService.getAllUsuarios(); //51. Hay una clase inmersa en nuestros procesos la cual no vamos a crear pero podemos
        model.addAttribute("usualist",listaUsuario); //usar y es la clase model, el cual se va a alimentar de una lista, en este caso la de Usuario.
        return "VerUsuarios";                                //Esa lista la saco de usuarioService y miro los métodos que me trae, en este caso getAllUsuarios().
    }                                  //52. Model entiende que lo que estamos trabajando es objeto modelable al que le puedo setear ciertas características.
                                        //53. Utilizo mi clase model para agregar atributos(modelar) a mis listaUsuarios.
                                        //54. me retorna un String que es VerUsuarios, el cual es super importante porque va hacer el nombre de la pagina html donde voy a poder ver los usuarios.
                                        //y tal cual debe de ir copiado en el package template de html.

}

