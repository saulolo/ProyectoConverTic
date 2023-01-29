package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Calificacion")
public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_calificacion", nullable = false)
    private int id;
    @Column(name = "valor_calificacion", nullable = false)
    private int valorCalificacion;
    @Column(name = "opinion")
    private String opinion;


}
