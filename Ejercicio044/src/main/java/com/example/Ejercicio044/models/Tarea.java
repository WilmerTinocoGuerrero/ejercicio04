package com.example.Ejercicio044.models;

import jakarta.persistence.*;
import java.time.LocalDate; 


@Entity
@Table(name = "tareas")
public class Tarea {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String curso;
    private LocalDate fecha;  // pipe de fecha para almacenar la fecha de entrega
    private String estado;
    private String prioridad;  // requisito para la alerta de urgente

    public Tarea() {}


 // getter and setter

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id;}

    public String getTitulo() { return titulo;}
    public void setTitulo(String titulo) { this.titulo = titulo;}

    public String getCurso() { return curso;}
    public void setCurso(String curso) {this.curso = curso;}

    public LocalDate getFecha() { return fecha;}
    public void setFecha(LocalDate fecha) { this.fecha = fecha;}

    public String getEstado() { return estado;}
    public void setEstado(String estado) {this.estado = estado;}

    public String getPrioridad() { return prioridad;}
    public void setPrioridad(String prioridad) {this.prioridad = prioridad;}
}
