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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_detalle", nullable = false)
    private int id;

    @OneToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
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
    

    public ProductoDetalle(Producto producto, Genero genero, Marca marca, Talla talla, Color color, Categoria categoria) {

        this.producto = producto;
        this.genero = genero;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
        this.categoria = categoria;
    }
}
