package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "ProductoVenta")
public class ProductoVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_producto_venta")
    private int id;
    @Column(name = "cantidad")
    private int cantidad;
    @ManyToOne
    @JoinColumn(name = "id_producto_detalle")
    private ProductoDetalle productoDetalle;



    public ProductoVenta() {
    }

    public ProductoVenta(int cantidad, ProductoDetalle productoDetalle) {
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
