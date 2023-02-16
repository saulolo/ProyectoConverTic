package ProyectoConverTic.ConverTic.service;

import ProyectoConverTic.ConverTic.modelo.Producto;
import ProyectoConverTic.ConverTic.modelo.ProductoDetalle;
import ProyectoConverTic.ConverTic.repository.ProductoDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoDetalleService {    //[119]

    @Autowired
    ProductoDetalleRepository productoDetalleRepository;

    //[120]

    //MÉTODO PARA VER LOS PRODUCTOS DETALLE
    public List<ProductoDetalle> getAllProductoDetalle() {
        List<ProductoDetalle> productoDetalleList = new ArrayList<>();
        productoDetalleRepository.findAll().forEach(productoDetalle -> productoDetalleList.add(productoDetalle));
        return productoDetalleList;
    }


    //MÉTODO PARA BUSCAR LOS PRODUCTOS DETALLE POR ID
    public Optional<ProductoDetalle> getProductoDetalleById(Integer id) {  //[121]
        return productoDetalleRepository.findById(id); //[122]
    }


    //MÉTODO PARA GUARDAR O ACTUALIZAR OBJETOS DE TIPO PRODUCTOS DETALLE
    public ProductoDetalle saveOrUpdateProductoDetalle(ProductoDetalle productoDetalleducto) {
        return productoDetalleRepository.save(productoDetalleducto);
    }


    //MÉTODO PARA ELIMINAR PRODUCTO (Elimina productos registrados teniendo el id)
    public boolean deleteProductoDetalle(Integer id) {
        productoDetalleRepository.deleteById(id);
        if (this.productoDetalleRepository.findById(id).isPresent()) {
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


    //[123] Nos dirijimos a ControllerFull


}
