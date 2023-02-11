package ProyectoConverTic.ConverTic;

import ProyectoConverTic.ConverTic.modelo.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//[0]

@RestController  //[1]
//[2].
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})  //[5]


public class ConverTicApplication {

    @GetMapping("/hello")    //[3].
    public String hello() {
        return "Hola ConverTic....saldremos vivos de esto";  //[4].
    }

    //[5.1] Configuración archivo application.properties

    @GetMapping("/test")//[12]
    /*
    public String test(){
    Usuario user1 = new Usuario("Calle la geta", "coco@gmail.com", "CC", "Luis Felipe", "Vasquez Jimémez", "Medellin", "Los Bernal", "Acepto");
    user1.setNombres("Carlos Villagrán como kiko");
    System.out.println("Aquí se creó la empresa y se renombró."); //Banderita que nos sirve de verificación.
    return user1.getNombres();
    }*/

    //[13] Creación de Tablas en las BD mediante Hibernate


    public static void main(String[] args) {
        SpringApplication.run(ConverTicApplication.class, args);

    }

}
