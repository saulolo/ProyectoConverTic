package ProyectoConverTic.ConverTic.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Ciudad")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciudad", nullable = false)
    private int id;
    @Column(name = "nombre_ciudad", nullable = false)
    private String nombreCiudad;

    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamento departamento;


}

