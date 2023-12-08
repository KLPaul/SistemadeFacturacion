/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class competencia {
    private int id_competencias;
    private String nombre;
    private String descripcion;

    public competencia() {
    }

    public competencia(int id_competencias, String nombre, String descripcion) {
        this.id_competencias = id_competencias;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId_competencias() {
        return id_competencias;
    }

    public void setId_competencias(int id_competencias) {
        this.id_competencias = id_competencias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
   public static boolean verificarExistenciaComp(ArrayList<competencia> compet, String nombre) {
        for (competencia comp : compet) {
            if (comp.getNombre().equals(nombre)) {
                return true;  // El rol existe
            }
        }
        return false;  // El rol no existe
    }
}
