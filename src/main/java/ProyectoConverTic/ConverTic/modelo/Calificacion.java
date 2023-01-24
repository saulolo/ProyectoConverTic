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





}
