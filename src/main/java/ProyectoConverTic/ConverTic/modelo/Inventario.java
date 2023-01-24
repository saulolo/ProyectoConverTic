package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int cantidad;
    @OneToOne
    @JoinColumn(name = "productoDetalle_id")
    private ProductoDetalle productoDetalle;


    public Inventario() {
    }


    public Inventario(int cantidad, ProductoDetalle productoDetalle) {
        this.cantidad = cantidad;
        this.productoDetalle = productoDetalle;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ProductoDetalle getProductoDetalle() {
        return productoDetalle;
    }

    public void setProductoDetalle(ProductoDetalle productoDetalle) {
        this.productoDetalle = productoDetalle;
    }
}



