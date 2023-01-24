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



    /*Hibernate: funciona como un traductor para que el lenguaje de Java se conecte con el lenguaje de SQL, creando
    una copia en forma de objetos de la BD y la pega en java. Hibernate se encarga de mantener la interacción Java - SQL
    actualizada.*/


    /*10. Se generan los constructores, uno vacío para que cuando no le envíe todos los parámetros requeridos, él me
    lo deje crear y otro con todos los atributos menos el id porque es incremental.*/
    public Usuario() {
    }




    //11. Se generan los getter and setter.



}

    //14. Crear del mismo modo las otras entidades.



