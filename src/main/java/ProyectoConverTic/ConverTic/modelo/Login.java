package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Login")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_carrito")
    private int id;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "contrasenia")
    private String contrasenia;
    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuarioLogin;



    public Login() {
    }

    public Login(String usuario, String contrasenia, Usuario usuarioLogin) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.usuarioLogin = usuarioLogin;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Usuario getUsuarioLogin() {
        return usuarioLogin;
    }

    public void setUsuarioLogin(Usuario usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }
}
