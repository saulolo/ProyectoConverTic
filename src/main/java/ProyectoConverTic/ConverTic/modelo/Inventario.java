package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_inventario")
    private int id;
    @Column(name = "cantidad")
    private int cantidad;



    public Inventario() {
    }

    public Inventario(int cantidad) {
        this.cantidad = cantidad;
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
}



