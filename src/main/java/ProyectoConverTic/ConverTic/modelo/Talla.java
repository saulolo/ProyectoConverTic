package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Talla")
public class Talla {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_talla")
    private int id;
    @Column(name = "nombre_talla")
    private String nombreTalla;



    public Talla() {
    }

    public Talla(String nombreTalla) {
        this.nombreTalla = nombreTalla;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreTalla() {
        return nombreTalla;
    }

    public void setNombreTalla(String nombreTalla) {
        this.nombreTalla = nombreTalla;
    }
}