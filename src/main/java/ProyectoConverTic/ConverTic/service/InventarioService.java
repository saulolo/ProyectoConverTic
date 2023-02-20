package ProyectoConverTic.ConverTic.service;

import ProyectoConverTic.ConverTic.modelo.Inventario;
import ProyectoConverTic.ConverTic.repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventarioService {

    @Autowired
    InventarioRepository inventarioRepository;

    //MÉTODO PARA VER LOS INVENTARIOS
    public List<Inventario> getAllInventario() {
        List<Inventario> inventarioList = new ArrayList<>();
        inventarioRepository.findAll().forEach(inventario -> inventarioList.add(inventario));
        return inventarioList;
    }

    //MÉTODO PARA GUARDAR LOS INVENTARIOS
    public boolean saveOrUpdateInvetario(Inventario inventario) {
        Inventario user = inventarioRepository.save(inventario); //Guarde de manera recursiva
        if (inventarioRepository.findById(user.getId()) != null) {
            return true;
        }
        return false;
    }

}
