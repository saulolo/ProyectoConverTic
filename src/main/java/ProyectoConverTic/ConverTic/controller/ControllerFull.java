package ProyectoConverTic.ConverTic.controller;

import ProyectoConverTic.ConverTic.modelo.*;
import ProyectoConverTic.ConverTic.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

//[43]

//[1]
@Controller  //[44]
//[45]

public class ControllerFull {

    @Autowired  //[47]
    UsuarioService usuarioService; //[46]
    @Autowired
    ProductoDetalleService productoDetalleService;
    @Autowired
    ProductoService productoService;
    @Autowired
    InventarioService inventarioService;
    @Autowired
    GeneroService generoService;
    @Autowired
    MarcaService marcaService;
    @Autowired
    TallaService tallaService;
    @Autowired
    ColorService colorService;
    @Autowired
    CategoriaService categoriaService;




    /*--------------------------------------------------------------------------------------*/
    /* SERVICIOS DEL USUARIO */


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

    /*--------------------------------------------------------------------------------------*/
    /* SERVICIOS DE PRODUCTO DETALLE */  //[124]


    //SERVICIO VER PRODUCTO DETALLE
    @GetMapping("/productoDetalle")
    public List<ProductoDetalle> verProductoDetalles() {
        return productoDetalleService.getAllProductoDetalle();
    }

/*  //SERVICIO GUARDAR PRODUCTO DETALLE  (Este método no puede estar aqui porque no voy a crear productos de detalle según mi Model E-R)
    @PostMapping("/productoDetalle")
    public Optional<ProductoDetalle> guardarProductoDetalle(@RequestBody ProductoDetalle prodDell) {  //[125]
        return Optional.ofNullable(this.productoDetalleService.saveOrUpdateProductoDetalle(prodDell)); //[126]
    }*/

    //SERVICIO BUSCAR/VER PRODUCTO DETALLE POR ID
    @GetMapping(path = "/productoDetalle{id}")
    public Optional<ProductoDetalle> productoDetallePorId(@PathVariable("id") Integer id) {
        return this.productoDetalleService.getProductoDetalleById(id);
    }

    //ACTUALIZAR EL JSON PRODUCTO DETALLE POR SUS ATRIBUTOS (No se si necesito este service aqui, porque la actualización no se hace desde esta clase)
    @PatchMapping("productoDetalle/{id}")
    public ProductoDetalle actualizarProductoDetalle(@PathVariable("id") Integer id, @RequestBody ProductoDetalle productoDetalle) {
        ProductoDetalle productoDetalle1 = productoDetalleService.getProductoDetalleById(id).get();
        productoDetalle1.setListaProductos(productoDetalle.getListaProductos());
        return productoDetalleService.saveOrUpdateProductoDetalle(productoDetalle1);
    }

    //ELIMINAR LOS REGISTROS PRODUCTO DETALLE DE LA BD
    @DeleteMapping("/productoDetalle/{id}")
    public String DeleteProductoDetalle(@PathVariable("id") Integer id) {
        boolean respuesta = productoDetalleService.deleteProductoDetalle(id);
        if (respuesta) {
            return "Se pudo eliminar correctamente el producto detalle con id " + id;
        } else {
            return "No se puede eliminar la correctamente el producto detalle con id " + id;
        }
    }

    //SERVICIO BUSCAR/VER PRODUCTO DETALLE QUE PERTENECEN AL USUARIO


    /*--------------------------------------------------------------------------------------*/
    /* SERVICIOS DE PRODUCTO  */  //[131]


    //SERVICIO VER PRODUCTOS
    @GetMapping({"/VerProductos"})
    public String viewProductos(Model model, @ModelAttribute("mensaje") String mensaje) {
        List<Producto> listaProductos = productoService.getAllProducto();
        model.addAttribute("prodlist", listaProductos);
        model.addAttribute("mensaje", mensaje);
        return "verProductos";
        //[132] Creo el html de verProductos en templates (para tener el mismo archivo de verUsuarios, le doy click derecho en verUsuarios - Refactor - coyfile y lo nombro verProductos)
    }

    //SERVICIO AGREGAR PRODUCTOS
    @GetMapping("/AgregarProducto")
    public String nuevoProducto(Model model, @ModelAttribute("mensaje") String mensaje) {
        ProductoDTO prod = new ProductoDTO(); //[138] Cuando ejecute este controlador y el controlador me lleve hasta su html, este va a llegar con:
        model.addAttribute("prod", prod); //[138.1] va a llegar con un objeto producto que es que esta en el front donde le meto valores a travez del tempate creado
        model.addAttribute("mensaje", mensaje); //[138.2] va a llegar con un posible mensaje que es el que utilizo para generar las ventanas emergentes y va a llegar con [138.3] una lista de detalles de productos, como se lo construí en la línea siguiente
        List<Genero> listaGenero = generoService.getAllGenero();  //[136] Hay otro atributo que necesito que mande para el html, una lista que va a ser de producto detalle que es la que voy a utilizar para generar un select en el template creado
        model.addAttribute("generoList", listaGenero); //[137] Luego lo agrego al modelo como atributo, el cual le pongo como nombre produDetalist que se alimenta de la lista creada en la liena anterior
        List<Marca> listaMarca = marcaService.getAllMarca();
        model.addAttribute("marcalist", listaMarca);
        List<Talla> listaTalla = tallaService.getAllTalla();
        model.addAttribute("tallalist", listaTalla);
        List<Color> listaColor = colorService.getAllColor();
        model.addAttribute("colorlist", listaColor);
        List<Categoria> listaCategoria = categoriaService.getAllCategoria();
        model.addAttribute("categorialist", listaCategoria);
        return "agregarProducto";
        //[133] Creo el html de agregarProducto en templates (para tener el mismo archivo de agregarUsuario, le doy click derecho en agregarUsuario - Refactor - coyfile y lo nombro agregarProducto)
    }

    //SERVICIO GUARDAR PRODUCTOS [141] Creo el servicio para el botón Guardar productos
    @PostMapping("/GuardarProducto")
    public String guardarProducto(ProductoDTO prodDTO, RedirectAttributes redirectAttributes) {
        System.out.println("Buscando error aqui 1 ==> ");

        Producto prod = new Producto(prodDTO.getNombreProducto(), prodDTO.getPrecio());
        Genero gen = new Genero();
        gen.setId(prodDTO.getIdGenero());
        Marca mar = new Marca();
        mar.setId(prodDTO.getIdMarca());
        Talla tall = new Talla();
        tall.setId(prodDTO.getIdTalla());
        Color col = new Color();
        col.setId(prodDTO.getIdColor());
        Categoria cat = new Categoria();
        cat.setId(prodDTO.getIdCategoria());


        int idProducto = productoService.saveOrUpdateProducto(prod);
        System.out.println("Buscando error 2 ==>" + idProducto);

        prod.setId(idProducto);

        ProductoDetalle prodDeta = new ProductoDetalle(prod, gen, mar, tall, col, cat);
        System.out.println("prodDeta 3 ==> " + prodDeta);


        prodDeta = productoDetalleService.saveOrUpdateProductoDetalle(prodDeta);
        //prodDeta.setId(11);
        System.out.println("prodDeta 4 ==> " + prodDeta);

        Inventario prodInv = new Inventario(prodDTO.getCantidad(), prodDeta);
        System.out.println("prodInv 5 ==> " + prodInv);
        boolean inventarioCreado = inventarioService.saveOrUpdateInvetario(prodInv);

        System.out.println("inventarioCreado 4 ==> " + inventarioCreado);

        System.out.println(prod);
        if (inventarioCreado) {
            redirectAttributes.addFlashAttribute("mensaje", "saveOK");
            return "redirect:/VerProductos";
        }
        redirectAttributes.addFlashAttribute("mensaje", "saveError");
        return "redirect:/AgregarProducto";
    }


    /*--------------------------------------------------------------------------------------*/
    /* SERVICIOS DEL INVENTARIO */


    //SERVICIO AGREGAR INVENTARIO [142]
    @GetMapping("/AgregarInventario")
    public String nuevoInventario(Model model, @ModelAttribute("mensaje") String mensaje) {
        Inventario inv = new Inventario();
        model.addAttribute("inv", inv);
        model.addAttribute("mensaje", mensaje);
        List<Inventario> listaInventario = inventarioService.getAllInventario();
        model.addAttribute("inveList", listaInventario);
        return "agregarProducto";

    }

}




