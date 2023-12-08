/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class producto_clasificacion {

    private int id_producto;
    private int id_clasificación;

    public producto_clasificacion() {
    }

    public producto_clasificacion(int id_producto, int id_clasificación) {
        this.id_producto = id_producto;
        this.id_clasificación = id_clasificación;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_clasificación() {
        return id_clasificación;
    }

    public void setId_clasificación(int id_clasificación) {
        this.id_clasificación = id_clasificación;
    }
 
    
    
}
