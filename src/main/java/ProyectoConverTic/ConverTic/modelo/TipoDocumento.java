package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "TipoDocumento")
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id_tipo_documento")
    private int id;
    @Column(name = "descripcion")
    private String descripcion;




    public TipoDocumento() {
    }





}
