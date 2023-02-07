package ProyectoConverTic.ConverTic.controller;

import ProyectoConverTic.ConverTic.modelo.Usuario;
import ProyectoConverTic.ConverTic.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    //SERVICIO VER USUARIO
    @GetMapping({"/", "VerUsuarios"}) //49. Creo dos landing para visualizarlo en el html.
    public String viewUsuario(Model model) {  //50. Creamos un método viewEmpresas(nombre opcional) que regrese cadenas.
        List<Usuario> listaUsuario = usuarioService.getAllUsuarios(); //51. Hay una clase inmersa en nuestros procesos la cual no vamos a crear pero podemos
        model.addAttribute("usualist", listaUsuario); //usar y es la clase model, el cual se va a alimentar de una lista, en este caso la de Usuario.
        return "VerUsuarios";                                //Esa lista la saco de usuarioService y miro los métodos que me trae, en este caso getAllUsuarios().
    }                                  //52. Model entiende que lo que estamos trabajando es objeto modelable al que le puedo setear ciertas características.
    //53. Utilizo mi clase model para agregar atributos(modelar) a mis listaUsuarios.
    //54. me retorna un String que es VerUsuarios, el cual es super importante porque va hacer el nombre de la pagina html donde voy a poder ver los usuarios.
    //y tal cual debe de ir copiado en el package template de html.
    //Nota: para que esto se ejecute debo tener la dependencia de Thymeleaf instalada.

    /*55. Cuando ejecute el código en este punto, me va a salir un error porque él esta esperando una salida por html y como
    aun no he generado el template, me sale un error esperado. Para ello vamos al package resources / templates, (en caso de
    que no exista la carpeta templates, la creamos haciendo click derecho en el package resources / new / Directory)*/

    /*56. Voy al package templates, click derecho new / html file y le pongo el mismo nombre de mi return en el microservicio
    a ese archivo, en este caso el de VerUsuarios.*/


    //SERVICIO AGREGAR USUARIO
    @GetMapping({"/AgregarUsuario"})
    public String nuevoUsuario(Model model) {  //63. String porque me devuelve el nombre del template e inserto un artefacto modelable
        Usuario user = new Usuario();  //64. Creamos un objeto de tipo Usuario gracias al constructor vacío para poderlo llamar en el front
        model.addAttribute("user", user);  //65. Nombre atributo "user" y en este atributo meto el usuario que acabo de crear user
        return "agregarUsuario";  //66. Me va a direccionar a la página agregarUsuario
    }
    //67. Procedo a crear el template agregarUsuario

    //78. Procedo a crear el servicio para guardar el usuario
    //SERVICIO GUARDAR USUARIO
    @PostMapping("/GuardarUsuario")
    //79. El servicio a utilizar es @PostMapping porque necesitamos enviar la información(setear)
    public String guardarUsuarios(Usuario user, RedirectAttributes redirectAttributes) { //80. RedirectAttributes es un atributo que me indica que ese método me va a redireccionar a algún lugar
        if (usuarioService.saveOrUpdateUsuario(user) == true) { //81. tenemos dos opciones crear un objeto de respuesta o verificar la respuesta desde el principio (nos vamos por esta última).
            return "redirect:/VerUsuarios";   //82. Verificamos esta ejecución desde el principio con condicionales, en el caso de ser verdadero (o sea que la creó) que me redireccione a la página VerUsuarios
        }     //NOTA: El redireccionamiento es hacia servicios no hacia el html (paginas web)
        return "redirect:/agregarUsuario";  //83. En el caso de ser falso (o sea que no guardo) que me redireccione a la página agregarUsuario
    }

    //SERVICIO EDITAR USUARIO
    /*84. Procedo a agregar las funciones del botón editar, para ello creo dos servicios, uno que me muestre la información
    que se registro y otro que una vez la edita, me actualice o guarde.*/
    @GetMapping({"/EditarUsuario"})
    public String editarUsuario(Model model, @PathVariable Integer id) { //85. Necesito los atributos de modelo y de Id que es como parte de la ruta de la página y para decirle que no es solo un Id sino que es una ruta, utilizo la anotación @PathVariable
        Usuario user = usuarioService.getUsuarioById(id);   //86. Después de crear la variable user la busco por el servicio que creamos para buscar usuario por id  (getUsuarioById) y guardarla en la variable user que cree
        model.addAttribute("user", user);       //87. Luego agregamos esa empresa a nuestro modelo para mandarlo a nuestro html, para alli llenar los campos.
        return "editarUsuario";     //88. Esto me regresa (return) una página de html que vamos a crear y que se llama editarUsuario.
    }

    //89. Procedo a crear en el package tenplates, el html de editarUsuario


}




