package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;


@Entity
@Table(name = "Calificacion")
public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_calificacion")
    private int id;
    @Column(name = "valor_calificacion")
    private int valorCalificacion;
    @Column(name = "opinion")
    private String opinion;


    public Calificacion() {
    }

    public Calificacion(int valorCalificacion, String opinion) {
        this.valorCalificacion = valorCalificacion;
        this.opinion = opinion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValorCalificacion() {
        return valorCalificacion;
    }

    public void setValorCalificacion(int valorCalificacion) {
        this.valorCalificacion = valorCalificacion;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}
