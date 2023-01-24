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



    public ProductoVenta() {
    }






}
