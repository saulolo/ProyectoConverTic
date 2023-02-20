package ProyectoConverTic.ConverTic.service;

import ProyectoConverTic.ConverTic.modelo.Producto;
import ProyectoConverTic.ConverTic.modelo.Usuario;
import ProyectoConverTic.ConverTic.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;


    //MÉTODO PARA VER LOS PRODUCTOS
    public List<Producto> getAllProducto() {
        List<Producto> productoList = new ArrayList<>();
        productoRepository.findAll().forEach(producto -> productoList.add(producto));
        return productoList;
    }

    //MÉTODO PARA BUSCAR PRODUCTOS POR ID
    public Optional<Producto> getProductoById(Integer id) {
        return productoRepository.findById(id);
    }


    //MÉTODO PARA GUARDAR O ACTUALIZAR OBJETOS DE TIPO PRODUCTOS
    public int saveOrUpdateProducto(Producto prod) {
        Producto produc = productoRepository.save(prod);
        return produc.getId();
    }


    //MÉTODO PARA ELIMINAR PRODUCTO (Elimina productos registrados teniendo el id)
    public boolean deleteProductos(Integer id) {
        productoRepository.deleteById(id);
        if (this.productoRepository.findById(id).isPresent()) {
            return false;
        }
        return true;
    }
    //Otra forma de escribir el método eliminar:
        /*public boolean deleteProductos(Integer id) {
        productoRepository.deleteById(id);
        if (productoRepository.findById(id) != null) {
            return true;
        }
        return false;
    }*/


    //[130] Me dirijo a controller/ControllerFull para crear los respectivos servicios


}
