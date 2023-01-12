package ProyectoConverTic.ConverTic;

import ProyectoConverTic.ConverTic.modelo.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //1. Hace un llamado al servidor y me va a traer una respuesta que me va a dejar ver en pantalla.
//2. Aplicativo de spring boot que se comunica con el servidor.
@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
//6. por defecto spring boot viene con protocolos de seguridad hay que habiliatarlos con (execlude.......)
//para que por el momento lo excluda y asi poder visualizar nuestro hola converTic.



public class ConverTicApplication {

	@GetMapping("/hello") 	//3. Ruta o mapeo de servicios, lo llamo 'hello'
	public String hello(){  //4. Metodo de retorno que se va a ver en la web no en la terminal
		return "Hola ConverTic....saldremos vivos de esto";
	}

	//5. se debe configurar el archivo application. properties, asi:
	/*
		spring.datasource.url=jdbc:'SGBD'://localhost:'#puerto'/'nombre de la BD'
		spring.datasource.username='el asignado, por defecto es: postgresql'
		spring.datasource.password='el asignado a mi SGBD de postgresql'

		server.port=8081 //pongo esta sentencia para decirle a mi aplicativo que trabaje con este puerto
		en caso de que el por defecto(8080) este ocupado.
	 */


	@GetMapping("/test") //13. Pruebo mis getters and setters en el localhost creando un objeto en otro (opcional) @GetMapping
	public String test(){
		Usuario user1 = new Usuario('C', "Saul Hernando", "Echeverri Duque", "saulolo@gmail.com", "ojo con eso");
		user1.setNombres("Carlos Villagran como kiko");
		//System.out.println("Aqui se creo la empresa y se renombró."); //Banderita que nos sirve de verificación.
		return user1.getNombres();
	}

	/* 14. Creo las tablas que van a ir en la BD y para ello voy al archivo application.properties y escribo la siguiente
	línea: spring.jpa.hibernate.ddl-auto=update, (update quiere decir que créelo si no ésta creada o si no, actualice la
	tabla) y a través de hibernate va a ver una interacción donde dice que se comunique con la BD y créelo.
	 */



	public static void main(String[] args) {
		SpringApplication.run(ConverTicApplication.class, args);

	}

}
