package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

@Entity
@Table(name="Usuario") //9. Esta anotación me permite relacionar mi entidad usuario con la tabla usuario, y como name. le puedo poner lo que desee.
public class Usuario {

    /* 6. Si fuera una clase de Java normal, crearíamos los atributos asi, pero como estamos trabajando programación para
     la web y estamos utilizando spring no solo estamos creando una clase, sino una entidad, eso prepara nuestro
     entorno orientado a las bases de datos, por ejemplo que debe relacionar nuestra clase usuario con los atributos
     correspondientes a una BD con la tabla Usuario cuyos campos son los atributos de la clase, eso lo hacemos con
     la anotación @entity.*/

    @Id //7. Debo crear el Id correspondiente a la tabla de la BD y se lo debo indicar con la anotación @Id
    // para que empalme con la BD.
    @GeneratedValue(strategy = GenerationType.AUTO) //8. Anotación que me indica que mi ID va hacer incremental.
    @Column(name = "id_usuario")
    private int id;
    @Column(name = "direccion") //8.1 Con @Colum(name = " ")Renombro el atributo de esta entidad de como lo voy a llamar en la BD
    private String direccion;
    @ManyToOne
    @JoinColumn(name = "id_departamento") //8.2 con @JoinColumn nos permite indicar el nombre de la columna a la que queremos hacer referencia en la tabla Departamento
    private Departamento departamento;
    @ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private TipoDocumento tipoDocumento;
    @Column(name = "numero_documento")
    private String numeroDocumento;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "email")
    private String email;
    @Column(name = "termino_condiciones")
    private boolean terminoCondiciones;
    @OneToMany //16. Anotacióm de asociación(relación) en este caso es uno a muchos.
    @JoinColumn(name = "id_carrito") /*17. Indico la clave, o sea por donde se van a unir esas columnas de las tablas.
    para ello llamo el id de la entidad que voy a relacionar, en este caso llamo el id de la entidad Carrito. Aqui me
    dice que el usuario (con minuscula) de esta entidad, se va a relacionar con el id*/
    private Carrito carrito; /*15. Debo establecer la relación entre la entidad Usuario y la entidad Producto, esto es
     instanciar una clase como atributo de otra, y para ello creo un atributo tipo objeto con la entidad que voy a
     relacionar, en este caso la de Usuario y la nombro como quiero. */



    /* 18. Hibernate: funciona como un traductor para que el lenguaje de Java se conecte con el lenguaje de SQL, creando
    una copia en forma de objetos de la BD y la pega en java. Hibernate se encarga de mantener la interacción Java - SQL
    actualizada.*/


    /*19. Se generan los constructores, uno vacío para que cuando no le envíe todos los parámetros requeridos, él me
    lo deje crear y otro con todos los atributos menos el id porque es incremental.*/
    public Usuario() {
    }

    public Usuario(String direccion, Departamento departamento, TipoDocumento tipoDocumento, String numeroDocumento, String nombres, String apellidos, String email, boolean terminoCondiciones, Carrito carrito) {
        this.direccion = direccion;
        this.departamento = departamento;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.terminoCondiciones = terminoCondiciones;
        this.carrito = carrito;
    }

    //11. Se generan los getter and setter.


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isTerminoCondiciones() {
        return terminoCondiciones;
    }

    public void setTerminoCondiciones(boolean terminoCondiciones) {
        this.terminoCondiciones = terminoCondiciones;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
}

    //14. Crear del mismo modo las otras entidades.



