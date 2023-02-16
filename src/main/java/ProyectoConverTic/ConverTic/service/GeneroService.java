package ProyectoConverTic.ConverTic.service;

import ProyectoConverTic.ConverTic.modelo.Genero;
import ProyectoConverTic.ConverTic.modelo.Inventario;
import ProyectoConverTic.ConverTic.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GeneroService {
    @Autowired
    GeneroRepository generoRepository;


    //MÉTODO PARA VER LOS GÉNEROS
    public List<Genero> getAllGenero() {
        List<Genero> generoList = new ArrayList<>();
        generoRepository.findAll().forEach(genero -> generoList.add(genero));
        return generoList;
    }

    //MÉTODO PARA GUARDAR LOS GÉNEROS
    public boolean saveOrUpdateGenero(Genero genero) {
        Genero user = generoRepository.save(genero);
        if (generoRepository.findById(user.getId()) != null) {
            return true;
        }
        return false;
    }


}
