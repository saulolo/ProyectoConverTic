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

    public Departamento(String nombreDepartamento, Departamento departamento) {
        this.nombreDepartamento = nombreDepartamento;
        this.departamento = departamento;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
