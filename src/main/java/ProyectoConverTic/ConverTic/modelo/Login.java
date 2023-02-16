package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Login")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrito", nullable = false)
    private int id;
    @Column(name = "usuario", nullable = false)
    private String usuario;
    @Column(name = "contrasenia", nullable = false)
    private String contrasenia;
    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuarioLogin;

}
