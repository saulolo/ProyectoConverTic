package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "EstadoPago")
public class EstadoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_estado_pago", nullable = false)
    private int id;
    @Column(name = "estado", nullable = false)
    private String estado;

}
