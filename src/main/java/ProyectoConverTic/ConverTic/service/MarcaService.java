package ProyectoConverTic.ConverTic.service;

import ProyectoConverTic.ConverTic.modelo.Genero;
import ProyectoConverTic.ConverTic.modelo.Marca;
import ProyectoConverTic.ConverTic.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarcaService {
    @Autowired
    MarcaRepository marcaRepository;


    //MÉTODO PARA VER LAS MARCAS
    public List<Marca> getAllMarca() {
        List<Marca> marcaList = new ArrayList<>();
        marcaRepository.findAll().forEach(marca -> marcaList.add(marca));
        return marcaList;
    }

}
