/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author barzo
 */
public class Tarea implements Comparable<Tarea>{
    private String tarea;
    private String descripcion;
    private String fecha;
    private String horaInicio;

    public Tarea(String tarea, String descripcion, String fecha, String horaInicio) {
        this.tarea = tarea;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    @Override
    public int compareTo(Tarea o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
