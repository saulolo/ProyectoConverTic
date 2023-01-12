package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

@Entity
@Table(name="Usuario") //10. Esta anotación me permite relacionar mi entidad usuario con la tabla usuario.
public class Usuario {

    /* 7. Si fuera una clase de Java normal, crearíamos los atributos asi, pero como estamos trabajando programación para
     la web y estamos utilizando spring no solo estamos creando una clase, sino una entidad, eso prepara nuestro
     entorno orientado a las bases de datos, por ejemplo que debe relacionar nuestra clase usuario con los atributos
     correspondientes a una BD con la tabla Usuario cuyos campos son los atributos de la clase, eso lo hacemos con
     la anotación @entity.*/

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //9. Anotación que me indica que mi ID va hacer incremental.
    private int numeroDocumento; //8. Debo crear el Id correspondiente a la tabla de la BD y se lo debo indicar con la anotación @Id
                                // para que empalme con la BD.
    private char tipoDocumento;
    private String nombres;
    private String apellido;
    private String correoElectronico;
    private String contrasenia;

    /*Hibernate: funciona como un traductor para que el lenguaje de Java se conecte con el lenguaje de SQL, creando
    una copia e forma de objetos de la BD y la pega en java>Hibernate se encarga de mantenerlo la interacción Java - SQL
    actualizada.*/

    public Usuario() { //11. Se generan los constructores, uno vacío para que cuando no le envíe todos los parámetros
                        // requeridos, él me lo deje crear y otro con todos los atributos menos el id porque es
                        // incremental.
    }

    public Usuario(char tipoDocumento, String nombres, String apellido, String correoElectronico, String contrasenia) {
        this.tipoDocumento = tipoDocumento;
        this.nombres = nombres;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.contrasenia = contrasenia;
    }

    //12. Se generan los getter and setter.
    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public char getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(char tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}


