package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Genero")
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_genero", nullable = false)
    private int id;
    @Column(name = "nombre_genero", nullable = false)
    private String nombreGenero;

}
