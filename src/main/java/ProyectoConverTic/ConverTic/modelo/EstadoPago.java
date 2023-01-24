package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "EstadoPago")
public class EstadoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_estado_pago")
    private int id;
    @Column(name = "estado")
    private String estado;




    public EstadoPago() {
    }





}
