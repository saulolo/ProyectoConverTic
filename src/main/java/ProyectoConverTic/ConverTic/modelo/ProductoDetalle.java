package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "ProductoDetalle")
public class ProductoDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_producto_detalle")
    private int id;
    @OneToMany
    @JoinColumn(name = "id_inventario")
    private Inventario inventario;
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





    public ProductoDetalle() {
    }

    public ProductoDetalle(Inventario inventario, Genero genero, Marca marca, Talla talla, Color color, Categoria categoria) {
        this.inventario = inventario;
        this.genero = genero;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
        this.categoria = categoria;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
