package ProyectoConverTic.ConverTic.service;

import ProyectoConverTic.ConverTic.modelo.Color;
import ProyectoConverTic.ConverTic.modelo.Talla;
import ProyectoConverTic.ConverTic.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ColorService {
    @Autowired
    ColorRepository colorRepository;

    //MÉTODO PARA VER LAS TALLAS
    public List<Color> getAllColor() {
        List<Color> colorList = new ArrayList<>();
        colorRepository.findAll().forEach(color -> colorList.add(color));
        return colorList;
    }
}
