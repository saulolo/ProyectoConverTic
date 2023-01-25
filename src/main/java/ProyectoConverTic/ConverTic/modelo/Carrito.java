package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Carrito")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_carrito")
    private int id;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "email")
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




    //20. Creo constructores
    public Carrito() {
    }

    public Carrito(Date fecha, String email, Calificacion calificacion, EstadoPago estadopago, ProductoVenta productoVenta) {
        this.fecha = fecha;
        this.email = email;
        this.calificacion = calificacion;
        this.estadopago = estadopago;
        this.productoVenta = productoVenta;
    }

    //21. creo los Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public EstadoPago getEstadopago() {
        return estadopago;
    }

    public void setEstadopago(EstadoPago estadopago) {
        this.estadopago = estadopago;
    }

    public ProductoVenta getProductoVenta() {
        return productoVenta;
    }

    public void setProductoVenta(ProductoVenta productoVenta) {
        this.productoVenta = productoVenta;
    }
}
