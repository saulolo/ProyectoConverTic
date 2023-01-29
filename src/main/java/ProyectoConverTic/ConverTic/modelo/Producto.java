package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_producto", nullable = false)
    private int id;
    @Column(name = "nombre_producto", nullable = false)
    private String nombreProducto;
    @OneToMany
    @JoinColumn(name = "id_producto_detalle")
    private ProductoDetalle productoDetalle;
    @Column(name = "precio", nullable = false)
    private double precio;


    //20. Creo constructores (los creé con las anotaciones de lombok).

    //21. creo los Getter and Setter (los creé con las anotaciones de lombok)

}
