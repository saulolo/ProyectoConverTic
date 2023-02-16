package ProyectoConverTic.ConverTic.service;

import ProyectoConverTic.ConverTic.modelo.Genero;
import ProyectoConverTic.ConverTic.modelo.Talla;
import ProyectoConverTic.ConverTic.repository.TallaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TallaService {
    @Autowired
    TallaRepository tallaRepository;

    //MÉTODO PARA VER LAS TALLAS
    public List<Talla> getAllTalla() {
        List<Talla> tallaList = new ArrayList<>();
        tallaRepository.findAll().forEach(talla -> tallaList.add(talla));
        return tallaList;
    }
}
