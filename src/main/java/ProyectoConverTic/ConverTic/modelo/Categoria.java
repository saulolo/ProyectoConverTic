package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombreCategoria;
    @OneToMany
    @JoinColumn(name = "productoDetalle_id")
    private ProductoDetalle productoDetalle;


    public Categoria() {
    }

    public Categoria(String nombreCategoria, ProductoDetalle productoDetalle) {
        this.nombreCategoria = nombreCategoria;
        this.productoDetalle = productoDetalle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public ProductoDetalle getProductoDetalle() {
        return productoDetalle;
    }

    public void setProductoDetalle(ProductoDetalle productoDetalle) {
        this.productoDetalle = productoDetalle;
    }
}
