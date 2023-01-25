package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Marca")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_marca")
    private int id;
    @Column(name = "nombre_marca")
    private String nombreMarca;




    public Marca() {
    }


    public Marca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
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
}



