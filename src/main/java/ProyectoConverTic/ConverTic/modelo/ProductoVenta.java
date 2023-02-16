package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "ProductoVenta")
public class ProductoVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_venta", nullable = false)
    private int id;
    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    @ManyToOne
    @JoinColumn(name = "id_producto_detalle")
    private ProductoDetalle productoDetalle;

}
