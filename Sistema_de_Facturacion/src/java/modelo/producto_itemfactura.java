/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class producto_itemfactura {
    
    private int id_item_factura;
    private int id_producto;

    public producto_itemfactura() {
    }

    public producto_itemfactura(int id_item_factura, int id_producto) {
        this.id_item_factura = id_item_factura;
        this.id_producto = id_producto;
    }

    public int getId_item_factura() {
        return id_item_factura;
    }

    public void setId_item_factura(int id_item_factura) {
        this.id_item_factura = id_item_factura;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }
    
    
}
