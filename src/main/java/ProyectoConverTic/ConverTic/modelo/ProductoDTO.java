package ProyectoConverTic.ConverTic.modelo;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductoDTO {

    private String nombreProducto;
    private double precio;
    private int cantidad;
    private int idGenero;
    private int idMarca;
    private int idTalla;
    private int idColor;
    private int idCategoria;

}
