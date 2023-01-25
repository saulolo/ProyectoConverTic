package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Genero")
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_genero")
    private int id;
    @Column(name = "nombre_genero")
    private String nombreGenero;


    public Genero() {
    }

    public Genero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }
}
