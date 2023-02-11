package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity //[6]
@AllArgsConstructor //[19.1]
@NoArgsConstructor  //[19.2]
//@Getter //[10.1]
//@Setter //[10.2]
@Data //[10.3]
//@ToString  //[11]
@Table(name = "Usuario") //[9]
public class Usuario {

    //[6] Atributos
    
    @Id //[7]
    @GeneratedValue(strategy = GenerationType.AUTO) //[8]
    @Column(name = "id_usuario", nullable = false) //[8.2]
    private int id;
    @Column(name = "direccion", nullable = false) //[8.1]
    private String direccion;
    @ManyToOne
    @JoinColumn(name = "id_departamento") //[8.3]
    private Departamento departamento;
    @ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private TipoDocumento tipoDocumento;
    @Column(name = "numero_documento", nullable = false)
    private String numeroDocumento;
    @Column(name = "nombres", nullable = false)
    private String nombres;
    @Column(name = "apellidos", nullable = false)
    private String apellidos;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "termino_condiciones", nullable = false)
    private boolean terminoCondiciones;
    @OneToMany(fetch = FetchType.LAZY) //[16]
    @JoinColumn(name = "id_carrito")  //[17]
    private List<Carrito> listaCarrito;  //[15]


    //[18] Hibernate


    //[19] Se generan los constructores con Lombok


    //[10] Getters and Setters

}

//[14] Crear las entidades



