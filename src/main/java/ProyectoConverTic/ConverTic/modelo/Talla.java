package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Talla")
public class Talla {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_talla", nullable = false)
    private int id;
    @Column(name = "nombre_talla", nullable = false)
    private String nombreTalla;

}
