package ProyectoConverTic.ConverTic.modelo;


import jakarta.persistence.*;

@Entity
@Table(name = "Ciudad")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_ciudad")
    private int id;
    @Column(name = "nombre_ciudad")
    private String nombreCiudad;



    public Ciudad() {
    }





}

