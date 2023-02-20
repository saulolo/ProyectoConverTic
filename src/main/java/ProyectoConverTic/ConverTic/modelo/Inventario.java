package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inventario", nullable = false)
    private int id;
    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @OneToOne
    @JoinColumn(name = "id_productoDetalle")
    private ProductoDetalle productoDetalle;


    public Inventario(int cantidad, ProductoDetalle productoDetalle) {
        this.cantidad = cantidad;
        this.productoDetalle = productoDetalle;
    }
}



