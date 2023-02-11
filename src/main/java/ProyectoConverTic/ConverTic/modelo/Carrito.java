package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Carrito")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_carrito", nullable = false)
    private int id;
    @Column(name = "fecha", nullable = false)
    private Date fecha;
    @Column(name = "email", nullable = false)
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


    //[20]

    //[21]

}
