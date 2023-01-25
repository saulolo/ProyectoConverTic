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

    public EstadoPago(String estado) {
        this.estado = estado;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
