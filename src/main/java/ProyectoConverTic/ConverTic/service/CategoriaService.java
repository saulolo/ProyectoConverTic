package ProyectoConverTic.ConverTic.service;

import ProyectoConverTic.ConverTic.modelo.Categoria;
import ProyectoConverTic.ConverTic.modelo.Color;
import ProyectoConverTic.ConverTic.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;


    //SERVICIO VER CATEGORÍAS
    public List<Categoria> getAllCategoria() {
        List<Categoria> categoriaList = new ArrayList<>();
        categoriaRepository.findAll().forEach(categoria -> categoriaList.add(categoria));
        return categoriaList;
    }
}
