package com.example.Ejercicio044.services;


import com.example.Ejercicio044.models.Tarea;
import com.example.Ejercicio044.repositories.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    public List<Tarea> obtenerTodas() { return tareaRepository.findAll(); }

    public Tarea guardarTarea(Tarea tarea) { return tareaRepository.save(tarea); }

    public Tarea actualizarTarea(Long id, Tarea detallesTarea) {
        Optional<Tarea> tareaExistente = tareaRepository.findById(id);
        if (tareaExistente.isPresent()) {
            Tarea tarea = tareaExistente.get();
            tarea.setTitulo(detallesTarea.getTitulo());
            tarea.setCurso(detallesTarea.getCurso());
            tarea.setFecha(detallesTarea.getFecha());
            tarea.setEstado(detallesTarea.getEstado());
            tarea.setPrioridad(detallesTarea.getPrioridad());
            return tareaRepository.save(tarea);

        }
        return null; // o lanzar una excepción
    }
    public void eliminarTarea(Long id) { tareaRepository.deleteById(id); }
}
