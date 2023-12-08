/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class rol {
    private int id_rol;
    private String rol;
    private Boolean estado;

    public rol() {
    }

    public rol(int id_rol, String rol, Boolean estado) {
        this.id_rol = id_rol;
        this.rol = rol;
        this.estado = estado;
    }
    

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    
    
    public static boolean verificarExistenciaRol(ArrayList<rol> roles, String Rol) {
        for (rol rol : roles) {
            if (rol.getRol().equals(Rol)) {
                return true;  // El rol existe
            }
        }
        return false;  // El rol no existe
    }
    
    public void activarRol() {

    // Validación de datos
    if (this.estado == true) {
        throw new IllegalArgumentException("El rol ya está activado");
    }

    // Activamos el rol
    this.estado = true;
}
}
