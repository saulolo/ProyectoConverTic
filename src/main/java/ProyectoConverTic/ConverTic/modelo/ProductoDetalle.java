package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "ProductoDetalle")
public class ProductoDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_producto_detalle", nullable = false)
    private int id;
    @OneToMany
    @JoinColumn(name = "id_inventario")
    private List<Inventario> listaProductos;
    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Genero genero;
    @ManyToOne
    @JoinColumn(name = "id_marca")
    private Marca marca;
    @ManyToOne
    @JoinColumn(name = "id_talla")
    private Talla talla;
    @ManyToOne
    @JoinColumn(name = "id_color")
    private Color color;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;


}
