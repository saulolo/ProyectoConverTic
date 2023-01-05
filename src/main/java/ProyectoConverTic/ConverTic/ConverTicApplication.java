package ProyectoConverTic.ConverTic;

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

	public static void main(String[] args) {
		SpringApplication.run(ConverTicApplication.class, args);

	}

}
