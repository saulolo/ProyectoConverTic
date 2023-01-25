package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Color")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_color")
    private int id;
    @Column(name = "nombre_color")
    private String nombreColor;


    public Color() {
    }

    public Color(String nombreColor) {
        this.nombreColor = nombreColor;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreColor() {
        return nombreColor;
    }

    public void setNombreColor(String nombreColor) {
        this.nombreColor = nombreColor;
    }
}


