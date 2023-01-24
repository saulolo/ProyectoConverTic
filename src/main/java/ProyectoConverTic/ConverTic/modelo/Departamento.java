package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_departamento")
    private int id;
    @Column(name = "nombre_departamento")
    private String nombreDepartamento;
    @ManyToOne
    @JoinColumn(name = "id_ciudad")
    private Departamento departamento;



    public Departamento() {
    }








}
