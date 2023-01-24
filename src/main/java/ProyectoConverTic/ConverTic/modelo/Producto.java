package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombreProducto;
    @OneToMany
    @JoinColumn(name = "productoDetalle_id")
    private ProductoDetalle productoDetalle;
    private double precio;


    //20. Creo constructores

    public Producto() {
    }

    public Producto(String nombreProducto, ProductoDetalle productoDetalle, double precio) {
        this.nombreProducto = nombreProducto;
        this.productoDetalle = productoDetalle;
        this.precio = precio;
    }


    //21. creo los Getter and Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public ProductoDetalle getProductoDetalle() {
        return productoDetalle;
    }

    public void setProductoDetalle(ProductoDetalle productoDetalle) {
        this.productoDetalle = productoDetalle;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
