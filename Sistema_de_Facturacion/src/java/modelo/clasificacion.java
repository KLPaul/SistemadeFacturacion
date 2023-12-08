/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class clasificacion {
    private int id_clasificación;
    private String grupo;

    public clasificacion() {
    }

    public clasificacion(int id_clasificación, String grupo) {
        this.id_clasificación = id_clasificación;
        this.grupo = grupo;
    }
    
    public int getId_clasificación() {
        return id_clasificación;
    }

    public void setId_clasificación(int id_clasificación) {
        this.id_clasificación = id_clasificación;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
}
