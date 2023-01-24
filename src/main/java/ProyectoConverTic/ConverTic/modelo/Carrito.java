package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Carrito")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_carrito")
    private int id;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "email")
    private String email;
    @OneToOne
    @JoinColumn(name = "id_calificacion")
    private Calificacion calificacion;
    @ManyToOne
    @JoinColumn(name = "id_estado_pago")
    private EstadoPago estadopago;
    @ManyToOne
    @JoinColumn(name = "id_producto_venta")
    private ProductoVenta productoVenta;




    //20. Creo constructores

    public Carrito() {
    }




    //21. creo los Getter and Setter

}
