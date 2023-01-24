package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Marca")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombreMarca;

    @OneToMany
    @JoinColumn(name = "productoDetalle _id")
    private ProductoDetalle productoDetalle;


    public Marca() {
    }


    public Marca(String nombreMarca, ProductoDetalle productoDetalle) {
        this.nombreMarca = nombreMarca;
        this.productoDetalle = productoDetalle;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public ProductoDetalle getProductoDetalle() {
        return productoDetalle;
    }

    public void setProductoDetalle(ProductoDetalle productoDetalle) {
        this.productoDetalle = productoDetalle;
    }
}



