package com.example.Ejercicio044.controllers;

import com.example.Ejercicio044.models.Tarea;
import com.example.Ejercicio044.services.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tareas")
@CrossOrigin(origins = "*") // Permite que el frontend Angular se conecte
public class TareaController {

    @Autowired
    private TareaService tareaService;

    @GetMapping
    public List<Tarea> listarTareas() { return tareaService.obtenerTodas(); }

    @PostMapping
    public Tarea crearTarea(@RequestBody Tarea tarea) { return tareaService.guardarTarea(tarea); }

    @PutMapping("/{id}")
    public Tarea actualizarTarea(@PathVariable Long id, @RequestBody Tarea tarea) { return tareaService.actualizarTarea(id, tarea); }

    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable Long id) { tareaService.eliminarTarea(id); }
}